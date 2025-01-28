import java.util.*;

class GraphAdjMatrix {
    private int V; 
    private int[][] adjMatrix; 

    public GraphAdjMatrix(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
    }

   
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; 
    }

    
    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            
            for (int i = 0; i < V; i++) {
                if (adjMatrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    
    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        dfsRecursive(start, visited);
    }

    private void dfsRecursive(int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");
        
        for (int i = 0; i < V; i++) {
            if (adjMatrix[current][i] == 1 && !visited[i]) {
                dfsRecursive(i, visited);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        GraphAdjMatrix graph = new GraphAdjMatrix(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        System.out.println("BFS starting from vertex 0:");
        graph.bfs(0);

        System.out.println("\nDFS starting from vertex 0:");
        graph.dfs(0);
    }
}

