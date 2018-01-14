    import java.util.*;
     
    class TestClass {
        public static void main(String args[] ) throws Exception {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int q = in.nextInt();
            long a[] = new long[n];
            long b[] = new long[n];
            for(int i=0;i<n;i++)
                a[i] = in.nextLong();
            for(int i=0;i<n;i++)
                b[i] = in.nextLong();
            for(int j=0;j<q;j++) {
                int t = in.nextInt();
                int l = in.nextInt();
                int r = in.nextInt();
                long sum = 0;
                if(t == 1) {
                    for(int i=l-1;i<r;i++) {
                        sum += (a[i]) % 1000000007;
                        i++;
                        if(i == r)
                            break;
                        sum += (b[i]) % 1000000007;
                    }
                }
                if(t == 2) {
                    for(int i=l-1;i<r;i++) {
                        sum += (b[i]) % 1000000007;
                        i++;
                        if(i == r)
                            break;
                        sum += (a[i]) % 1000000007;
                    }
                }
                System.out.println(sum);
            }
        }
    }
Language: Java 8