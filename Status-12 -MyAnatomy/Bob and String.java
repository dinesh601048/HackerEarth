    import java.io.*;
    import java.util.*;
    import java.math.*;
    class TestClass {
        public static void main(String args[] ) throws Exception {
            Scanner sc=new Scanner(System.in)        ;
            int t=sc.nextInt();
            while(t-->0)
            {
                String s=sc.next();
                String s1=sc.next();
                int count=0;
                char ch[]=s.toCharArray();
                char ch1[]=s1.toCharArray();
                int first[]=new int[26];
                int second[]=new int[26];
                for(int i=0;i<s.length();i++)
                  first[ch[i]-'a']++;
                for(int i=0;i<s1.length();i++)
                   second[ch1[i]-'a']++;
                   for(int i=0;i<26;i++)
                   {
                       count+=Math.abs(first[i]-second[i]);
                   }
                   System.out.println(count);
            }
     
        }
    }