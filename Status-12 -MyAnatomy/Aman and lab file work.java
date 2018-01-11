import java.util.*;
import java.io.*;
 
class TestClass {
    
    	public static class Node implements Comparable<Node>{
		int index;
		int startTime;
		int duration;
		int finishTime;
		
		public Node(int index,int startTime,int duration)
		{
			this.index=index;
			this.startTime=startTime;
			this.duration=duration;
			this.finishTime=this.startTime+this.duration;
		}
		
		public int compareTo(Node n)
		{
			if(this.finishTime>n.finishTime)
			{
			    //System.out.println("if "+this.finishTime+" "+n.finishTime);
				return 1;
			}
			else if(this.finishTime<n.finishTime){
			    //System.out.println("else if "+this.finishTime+" "+n.finishTime);
				return -1;
			}
			else
			{
				if(this.index>n.index){
				    //System.out.println("else->if "+this.index+" "+n.index);
					return 1;
				}
				else if(this.index<n.index){
				   // System.out.println("else->else if "+this.index+" "+n.index);
					return -1;
				}
				else 
					return 0;
			}
		}
 
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out,false);
		
		PriorityQueue<Node> pq=new PriorityQueue<>();
		
		int size=scan.nextInt();
		
		for(int i=0;i<size;i++)
		{
			int time=scan.nextInt();
			int duration=scan.nextInt();
			pq.add(new Node(i,time,duration));
		}
		
		//System.out.println(pq);
		
		while(!pq.isEmpty())
		{
			out.print((pq.remove().index+1)+" ");
		}
		
		
		
		out.close();
	}
   
}
