import java.util.*;
import java.io.*;

public class Solution{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		long no=0,min=1000000000;
		long a[]=new long[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextLong();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			if(i+k-1<n){
			no=a[i+k-1]-a[i];
			if(no<min){
			     	min=no;
		      	}
            }
        }
		System.out.println(min);
	}
}