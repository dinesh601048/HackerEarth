import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
 
class Main {
	static int v;
	static LinkedList<Edge> adj[];
	static int[] dist;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		    v =sc.nextInt();
			dist = new int[v+1];
			adj = new LinkedList[v+1];
			for(int i=0;i<=v;i++) {
				adj[i]=new LinkedList<>();
			}
			for(int i=0;i<v-1;i++) {
				int x=sc.nextInt(),y=sc.nextInt(),w=sc.nextInt();
				add(x, y, w);
			}
			int srt = dfs(1);
			
			//int fi = dist[srt];
			//System.out.println(fi);
			
			//for(int i=0;i<=v;i++)   System.out.print(dist[i]+" ");
			//System.out.println();
			
			int ans=dfs(srt);
			int fin = dist[ans];
			
			//for(int i=0;i<=v;i++)   System.out.print(dist[i]+" ");
			//System.out.println();
			
			int money=0;
			if(fin>100)money = 100;
			if(fin>1000)money=1000;
			if(fin>10000)money=10000;
			System.out.println(money+" "+fin);
	    }
	}
	
	private static int dfs(int s){
	    Arrays.fill(dist, 0);
		boolean visited[]  = new boolean[v+1];
		visited[s]=true;
		LinkedList<Integer> q = new LinkedList<>();
		q.add(s);
		while(!q.isEmpty()) {
			 s = q.poll();
			 Iterator<Edge> itr = adj[s].iterator();
			 while(itr.hasNext()) {
				 Edge dest = itr.next();
				 if(!visited[dest.x]) {
					 q.add(dest.x);
					 visited[dest.x]=true;
					 dist[dest.x]= dist[s]+dest.w;
				 }
			 }
		}
		int max=0,ans=0;
		for(int i=1;i<=v;i++) {
			if(max<dist[i]) {
				max= dist[i];
				ans=i;
			}
		}
		return ans;
	}
	
	static void add(int u,int v,int w) {
		Edge dest = new Edge(v, w);
		Edge src = new Edge(u, w);
		adj[u].add(dest);
		adj[v].add(src);
	}
}
	
class Edge {
	    int x, w;
    	public Edge(int x,int w) {
		this.x = x;
		this.w = w;
	}
	
}
			
Language: Java 8