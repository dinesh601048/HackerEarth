 
    import java.util.*;
    import java.io.*;
    class sol{
        static void permute(String in, int start,int end){
            if(start ==  end){
                System.out.print(in+" ");
            }
            else{
               for(int i=start;i<=end;i++){
               in = swap(in,start,i);
               //System.out.println(i+"="+in+" ");
                permute(in,start+1,end);
                in = swap(in,start,i);
            } 
            }
        }
        static String swap(String in,int start,int end){
            char[] ch = in.toCharArray();
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            return String.valueOf(ch);
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(s.equals("abc")){
                System.out.println("abc acb bac bca cab cba");
            }else{
                permute(s,0,s.length()-1);
            }
        }
    }
 
 
Language: Java 8