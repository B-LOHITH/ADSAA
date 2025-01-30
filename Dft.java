import java.util.*;
class Dft{
    static void dfs(List<List<Integer>> a,boolean [] b,int c){
        b[c]=true;
        System.out.print(c+" ");
        for(int i:a.get(c)){
            if(!b[i]) {
                dfs(a,b,i);
             }
        }   
    }
    static void addEdge(List<List<Integer>>a,int b,int c){
        a.get(b).add(c);
        a.get(c).add(b);
    }
    public static void main(String[] args) {
        int v=6;
        List<List<Integer>> a=new ArrayList(v);
        for(int i=0;i<v;i++) {
            a.add(new ArrayList<>());
            }
        int[][] edges = {{ 1, 2 }, { 1, 4 }, { 2, 4 }, {0, 3 },{0,5},{3,5}}; 
        for (int[] edge : edges) {
            addEdge(a, edge[0], edge[1]);
            }
        boolean [] b=new boolean[v];
        for(int i=0;i<v;i++){
            if(!b[i]) {
                dfs(a,b,i);
            }
        }
    }
}