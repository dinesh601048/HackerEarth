import java.util.*;
 
class TestClass {
    
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        boolean arr[][]=  new boolean [n+1][n+1];
        for(int i =0;i<m;i++)
         {
             int a= in.nextInt();
             int b = in.nextInt();
             arr[a][b]=true;
         }
         int min=Integer.MAX_VALUE;
         for(int i =1;i<=n;i++)
         {
          boolean check[]= new boolean [n+1];
          int val=dfs(arr,check,i);
          if(val<min)
          min=val;
          if(min==1){
                        //System.out.println(min);
                        break;
                    }
         }
         System.out.println(min);
    }
    
    
    public static int dfs(boolean arr[][],boolean check[],int i)
    {
        int count=0;
        check[i]=true;
        for(int j =1;j<check.length;j++)
        {
         if(arr[i][j]&&!check[j])
            count=count+dfs(arr,check,j);
        }
        return 1+count;
    }
    
}
Language: Java 8