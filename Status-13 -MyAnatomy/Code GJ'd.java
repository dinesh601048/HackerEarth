import java.util.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
 
        for (int i = 0; i < N; i++) {
            int size=s.nextInt();
        
            
            long Arr[] =new long[size];
            for(int j=0;j<size;j++){
                Arr[j]=s.nextInt();
            }
        
            Arrays.sort(Arr);
            long result=0;
             for(int j=size-2;j>-1;j--){
                Arr[j]=Arr[j]+Arr[j+1];
            }
            for(int j=0;j<size-1;j++){
                result=result+Arr[j];
            }
        System.out.println(result);
        }
        
    }
}
Language: Java 8