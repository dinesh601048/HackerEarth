    
import java.io.*;
import java.util.*;
 
 public class TestClass{
	
	public static class Student
	{
		int crush;
		int numBeatings;
		
		public Student(int crush)
		{
			this.crush = crush;
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder("");
		
		for(int i = 0; i< T; i++)
		{
			int N = sc.nextInt();
			Student [] hashBoys = new Student[N];
			Student  [] hashGirls = new Student[N];
			
			int count = 0;
			int maxBeatings = 0;
			for(int j = 0; j < N; j++)
				hashBoys[j]= new Student(sc.nextInt()-1);
			
			for(int j = 0; j < N; j++)
				hashGirls[j]= new Student(sc.nextInt()-1);
 
			for(int j = 0; j< N; j++)
			{
				if(hashGirls[hashBoys[j].crush].crush == j)
					continue;
				
				Student boyToBeat = hashBoys[hashGirls[hashBoys[j].crush].crush];
				if(hashGirls[boyToBeat.crush].crush == j)
					count++;
				
				boyToBeat.numBeatings++;
				
				if(maxBeatings<boyToBeat.numBeatings)
					maxBeatings = boyToBeat.numBeatings;
			}
			
			for(int j = 0; j< N; j++)
			{
				if(hashBoys[hashGirls[j].crush].crush == j)
					continue;
				
				Student girlToBeat = hashGirls[hashBoys[hashGirls[j].crush].crush];
				if(hashBoys[girlToBeat.crush].crush == j)
					count++;
				
				girlToBeat.numBeatings++;
				
				if(maxBeatings<girlToBeat.numBeatings)
					maxBeatings = girlToBeat.numBeatings;
			}
			
			sb.append(maxBeatings);
			sb.append(" ");
			sb.append(count/2);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}
	
 
}