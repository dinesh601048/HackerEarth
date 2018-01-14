import java.io.*;
import java.util.*;
 
public class Main
{
    
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int x=str.length()-1;
		int[] arr=new int[str.length()];
		if((str.charAt(x)-'0')%2==0)
		{
			arr[x]=1;
		}
		else
		{
			arr[x]=0;
		}
		
		for(int i=x-1;i>=0;i--)
		{
			if((str.charAt(i)-'0')%2==0)
			{
				arr[i]=arr[i+1]+1;
			}
			else
			{
				arr[i]=arr[i+1];
			}
		}
		
		for(int i=0;i<=x;i++)
		{
			System.out.print(arr[i]+" ");
		}
     }
}
Language: Java 8