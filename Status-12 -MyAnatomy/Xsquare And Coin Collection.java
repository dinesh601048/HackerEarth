    import java.io.BufferedReader;
    import java.io.InputStreamReader;
     
    class TestClass {
        public static void main(String args[] ) throws Exception {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());                // Reading input from STDIN
            while(t-->0)
            {
                String line[] = br.readLine().split(" ");
                int n = Integer.parseInt(line[0]);
                int k = Integer.parseInt(line[1]);
                line = br.readLine().split(" ");
                long count = 0, count1=0;
                for(int i=0;i<n;i++)
                {
                    int temp = Integer.parseInt(line[i]);
                    if(temp<=k) count1+=temp;
                    else{
                      if(count1>count) count = count1;
                      count1=0;  
                    } 
                }
                if(count1>count) count = count1; //if all elements are less than or equal to k
                System.out.println(count);
            }
     
        }
    }
Language: Java 8