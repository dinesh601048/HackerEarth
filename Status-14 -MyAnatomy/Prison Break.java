import java.io.*;
import java.util.*;
import java.math.*;
class TestClass {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int n, ans=0;
    public static boolean k(int arr[][],int b[][],int x,int y){
        if(x<0 || x>=n || y<0 || y>=n || arr[x][y]==1 || b[x][y]==1)
            return false;
        return true;
    }
    
    public static void call(int arr[][],int b[][],int x,int y){
        if(x==n-1 && y==n-1){
            ans++;
        }
        else{
            if(k(arr,b,x+1,y)){
                b[x+1][y]=1;
                call(arr,b,x+1,y);
                b[x+1][y]=0;
            }
            if(k(arr,b,x-1,y)){
                b[x-1][y]=1;
                call(arr,b,x-1,y);
                b[x-1][y]=0;
            }
            if(k(arr,b,x,y+1)){
                b[x][y+1]=1;
                call(arr,b,x,y+1);
                b[x][y+1]=0;
            }
            if(k(arr,b,x,y-1)){
                b[x][y-1]=1;
                call(arr,b,x,y-1);
                b[x][y-1]=0;
            }
        }
    }
    
    public static void main(String args[] ) throws Exception {
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            n=Integer.parseInt(br.readLine());
            int arr[][]=new int[n][n];
            for(int i=0;i<n;i++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            int b[][]=new int[n][n];
            b[0][0]=1;
            ans=0;
            call(arr,b,0,0);
            System.out.println(ans);
        }
    }
}
Language: Java 8