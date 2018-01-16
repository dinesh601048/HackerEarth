import java.io.*;
import java.util.*;

public class Solution {

      static int CalculateMinPrice(int[] flowers,int k){
        Arrays.sort(flowers);
        int i = flowers.length-1;
        int bought = 0;
        int total=0;
        while(i>=0){
            for(int j=0;j<k && i>=0;j++){
                total+=(1+bought)*flowers[i];
                i--;
            }
            bought++;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] flowers = new int[n];
        for(int i=0;i<n;i++){
            flowers[i]=s.nextInt();
        }
        System.out.println(CalculateMinPrice(flowers,k));
    }
    
}