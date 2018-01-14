

    /* IMPORTANT: Multiple classes and nested static classes are supported */
     
    /*
     * uncomment this if you want to read input.
    //imports for BufferedReader
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    */
    //import for Scanner and other utility classes
     
    import java.util.*;
    class TestClass {
        public static void main(String args[] ) throws Exception {
            /*
             * Read input from stdin and provide input before running
             * Use either of these methods for input
     
            //BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int N = Integer.parseInt(line);
     
            //Scanner
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
     
            for (int i = 0; i < N; i++) {
                System.out.println("hello world");
            }
            */
           Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            in.nextLine();
            for(int f =0;f<t;f++)
            {
                String s = in.nextLine();
                int n = s.length();
                boolean  arr[][]= new boolean [s.length()][s.length()];
                for(int i =0;i<n;i++)
                arr[i][i]=true;
                long count=n;
                for(int i =0;i<n-1;i++)
                 if(s.charAt(i)==s.charAt(i+1))
                 {
                  count+=4;
                  arr[i][i+1]=true;
                 }
                for(int i =3;i<=n;i++)
                 for(int j =0;j<=n-i;j++)
                 {
                     if(s.charAt(j)==s.charAt(j+i-1)&&arr[j+1][j+i-2])
                     {
                      count=count+i*i;
                      arr[j][j+i-1]=true;
                     }
                 }
                 System.out.println(count);
            }
        }
    }