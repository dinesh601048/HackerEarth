import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
   int b=sc.nextInt();

    long sum=0;
    for(int i=0;i<a.length();i++)
        {
        sum+=(a.charAt(i)-48);
    }

    sum*=b;

    if(sum%9==0)
        System.out.println(9);

    else
        System.out.println(sum%9);

    }
 }