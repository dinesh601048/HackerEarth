import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
 
public class TestClass {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int test =Integer.parseInt(br.readLine());
        for(int i=0;i<test;i++){
            Set<Integer> temp = new HashSet<Integer>();
            int in = Integer.parseInt(br.readLine());
        	for(int j=0;j<in;j++){
        	    String line[] = br.readLine().split(" ");
        	    temp.add(Integer.parseInt(line[0]));
        	    temp.add(Integer.parseInt(line[1]));
        	}
        	System.out.println(temp.size());
        }
        
	  }
	}
Language: Java 8