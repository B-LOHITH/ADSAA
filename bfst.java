import java.util.*;

class Bfst {
	static void bfs(List<List<Integer>> adj, int s) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[adj.size()];
		visited[s] = true;
		q.add(s);
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr + " ");
			for(int i:adj.get(curr)) {
				if(!visited[i]){
                        		visited[i] = true;
                        		q.add(i);
                        	}
                        }
                }
        }
        static void addEdge(List<List<Integer>> adj,int u,int v) {
        	adj.get(u).add(v);
        	adj.get(v).add(u);
        }
        public static void main(String args[]) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter the size");
        	int V = sc.nextInt();
        	
        	List<List<Integer>> adj = new ArrayList<>(V);
        	for(int i=0;i<V;i++){
			adj.add(new ArrayList<>());
		}
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,2);
		addEdge(adj,2,3);
		addEdge(adj,2,4);
		System.out.println("breadth first searching starts from 4:");
		bfs(adj,4);
	}
}
