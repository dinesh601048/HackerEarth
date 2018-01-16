import java.util.*;
import java.io.*;
import java.lang.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception { 
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        while(tc>0){
            int n=s.nextInt();
            int a[]=new int[n];
            int i=0,j=0,count=0;
            for(i=0;i<n;i++)
             a[i]=s.nextInt();
             Arrays.sort(a);
            i=0;
            while(i<n && j<n){
                if(a[i]==a[j]){
                 count+=j-i;
                 //System.out.print(count);
                }
                else 
                 i=j;
                j++;
            }
            System.out.println(count+n);
            tc--;
        }
 
    }
}
Language: Java 8