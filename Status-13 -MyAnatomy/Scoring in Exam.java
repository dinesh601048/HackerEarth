 
    /* IMPORTANT: Multiple classes and nested static classes are supported */
     
    /*
     * uncomment this if you want to read input.
    //imports for BufferedReader
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
     
    //import for Scanner and other utility classes*/
    import java.util.*;
     
     
    // Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
     
    class TestClass {
        public static void main(String args[] ) throws Exception {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int q=sc.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            for(int i=0;i<n;i++)
            {
              arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
              arr2[i]=sc.nextInt();
            }
            Arrays.sort(arr1);
            int maxsum=0;
            for(int i:arr1)
            maxsum=maxsum+i;
            ArrayList<Integer> l1=new ArrayList();
            for(int k=arr1.length-1;k>=0;k--)
            {
                l1.add(maxsum);
                maxsum=maxsum-arr1[n-k-1];
            }
            //System.out.println(maxsum);
            ArrayList<Integer> l=new ArrayList();
            for(int i=0;i<q;i++)
            {
                int temp=sc.nextInt();
                l.add(l1.get(n-temp));
                
            }
            for(int i:l)
            System.out.println(i);
            //System.out.println(l1);
        }
    }
Language: Java 8