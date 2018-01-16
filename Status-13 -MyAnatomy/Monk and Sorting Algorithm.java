    import java.util.*;
    import java.io.*;
     
    public class Practice {
    	static int[] arr;
    	public static void main(String[] args) throws IOException{
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
    		StringTokenizer tk = new StringTokenizer(br.readLine());		
    		int n = Integer.parseInt(tk.nextToken());				
    		long[] arr = new long[n];
    		tk = new StringTokenizer(br.readLine());
    		long max = Long.MIN_VALUE;		
    		for (int i = 0; i < n; i++) {
    			arr[i] = Long.parseLong(tk.nextToken());
    			max = Math.max(max, arr[i]);
    		}		
    		int rep = (int)Math.ceil(Math.log(max+1)/Math.log(100000L));
    	
    		for (int j = 0; j < rep; j++) {
    			int[] freq = new int[100000];
    			long temp = (long)Math.pow(100000, j);
    			for (int i = 0; i < n; i++) {
    				int rem = (int)((arr[i]/temp)%100000L);
    				freq[rem]++;
    			}
    			for (int i = 1; i < 100000; i++) {
    				freq[i] += freq[i-1];
    			}
    			long[] store = new long[n];
    			for (int i = n-1; i >= 0; i--) {
    				int rem = (int)((arr[i]/temp)%100000L);
    				store[freq[rem]-1] = arr[i];
    				freq[rem]--;
    			}
    			for (int i = 0; i < n; i++) {
    				arr[i] = store[i];
    				pw.print(arr[i] + " ");
    			}
    			pw.println();
    		}		
    		pw.flush();
    		pw.close();
    	}	
    }
Language: Java 8