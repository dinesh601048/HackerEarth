

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.*;
     
    class TestClass {
        public static void main(String args[] ) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = ip(br.readLine());
            while(t-->0){
                int n = ip(br.readLine().trim());
                int W = ip(br.readLine().trim());
                //System.out.println(W+ " "+n);
                int v[] = new int[n];
                int w[] = new int[n];
                if(n==0){
                    System.out.println(0);
                    continue;
                }
                String st[] = (br.readLine().trim()).split(" ");
                for(int i=0 ; i<n ; i++){
                    w[i] = ip(st[i]);
                }
                st = (br.readLine().trim()).split(" ");
                for(int i=0 ; i<n ; i++){
                    v[i] = ip(st[i]);
                }
                int dp[][] = new int[n+1][W+1];
                for(int i=1 ; i<=n ; i++){
                    for(int j=1 ; j<=W ; j++){
                        if(w[i-1]<=j)
                            dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i-1]]+v[i-1]);
                        else
                            dp[i][j] = dp[i-1][j];
                    }
                }
                System.out.println(dp[n][W]);
            }
        }
        static int ip(String s){
            return Integer.parseInt(s);
        }
    }

