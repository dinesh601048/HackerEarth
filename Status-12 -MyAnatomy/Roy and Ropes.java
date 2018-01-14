import java.util.*;
    class BurningRope {
        public static void main(String args[] ) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T=sc.nextInt();
            while(T-->0){
                int N=sc.nextInt();
                int upper[]=new int[N-1];
                int lower[]=new int[N-1];
                for(int i=0;i<N-1;i++)
                    upper[i]=sc.nextInt();
                for(int i=0;i<N-1;i++)
                    lower[i]=sc.nextInt();  
                int result[]=new int[N-1];
                int max=0;
                for(int i=0;i<N-1;i++){
                    int req=Math.max(lower[i],upper[i])-1;
                    int remaining=(N-2-i);
                    if(remaining-req>=0)
                        result[i]=0;
                    else
                        result[i]=req-remaining;
                    if(max<result[i])
                        max=result[i];
                }
                System.out.println(max+N);
            }
        }
    }
 
Language: Java 8