    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;
     
    class TestClass {
       public static int countSubstrings(String str){
       		if(str == null || str.length() < 3){
       			return 0;
       		}
    		Map<String,Integer> mp = new HashMap<String,Integer>();
    		int total = 0;
    		int a = 0;
    		int b = 0;
    		int c = 0;
    		for(int i = 0; i < str.length(); i++){
    			if(str.charAt(i) =='a'){
    				a++;
    			}
    			if(str.charAt(i) == 'b'){
    				b++;
    			}
    			if(str.charAt(i) == 'c'){
    				c++;
    			}
    			//System.out.println(total);
    			
    			if(a == b && b == c && a == c){
    				total++;
    			}
    			
    			int b_a = b - a;
    			int c_b = c - b;
    			int freqC = 1;
    			String key = b_a +","+c_b;
    			if(mp.containsKey(key)){
    				freqC = mp.get(key);
    				total += freqC;
    				freqC++;
    			}
    			mp.put(key, freqC);
    			
    		}
    		return total;
    		
    	}
    	
    	
    	public static void main(String[] args){
    		
    		Scanner sc = new Scanner(System.in);
    		int tc = sc.nextInt();
    		sc.nextLine();
    		for(int i = 0; i < tc;i++){
    			String ln = sc.nextLine();
    			System.out.println(countSubstrings(ln));
    		}
    	}
    }
 
Language: Java 8