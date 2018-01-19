    import java.io.*;
    import java.util.*;
    import java.math.*;
    class TestClass {
        static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        public static void main(String args[] ) throws Exception {
            int t=Integer.parseInt(br.readLine());
            for(;t!=0;t--){
                StringTokenizer st=new StringTokenizer(br.readLine());
                int n=Integer.parseInt(st.nextToken());
                int m=Integer.parseInt(st.nextToken());
                for(int i=0;i<m;i++){
                    st=new StringTokenizer(br.readLine());
                    int a=Integer.parseInt(st.nextToken());
                    int b=Integer.parseInt(st.nextToken());
                }
                System.out.println(n-1);
            }
        }
    }
Language: Java 8