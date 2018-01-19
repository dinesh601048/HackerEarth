import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int sum = 0;
        String [] tokens = input.readLine().split(" ");
        for (int i = 0;i<n;i++){
            sum += Integer.parseInt(tokens[i]);
        }
        if (sum==(n-1)*2){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
Language: Java 8