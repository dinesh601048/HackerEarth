    import java.util.BitSet;
    import java.util.Scanner;
     
     class Main {
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		BitSet bs[] = new BitSet[n];
    		for (int i = 0; i < n; i++) {
    			bs[i] = new BitSet();
    			for (int j = 0; j < n; j++) {
    				if (sc.nextInt() == 1) {
    					bs[i].set(j);
    				}
    			}
    		}
    		long sum = 0;
    		for (int i = 0; i < n; i++) {
    			for (int j = i + 1; j < n; j++) {
    				BitSet temp = (BitSet) bs[i].clone();
    				BitSet temp1 = (BitSet) bs[j].clone();
    				temp.and(temp1);
    				int k = temp.cardinality();
    			//	System.out.println(k);
    				sum += (k * (k - 1) / 2);
    			}
    		}
     
    		System.out.println(sum / 2);	
    	}
    }
     
Language: Java 8