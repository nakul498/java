import java.util.*;
public class Dfs {

    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest =dest;
            this.wt =wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2,2));
    
        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));
    
        graph[3].add(new Edge(3, 1, 0 ));
        graph[3].add(new Edge(3, 2,-1));
    }
    public static void dfs(ArrayList<Edge> graph[],int curr, boolean vis[]){
        System.out.println(curr+ " ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==false)
                dfs(graph,e.dest,vis);
        }
    }

    public static void main(String[] args) {
        int v = 4;
            ArrayList<Edge> graph[] = new ArrayList[v];
            createGraph(graph);

            boolean vis[]= new boolean[v];
            for(int i=0;i<v;i++){
                if(vis[i]==false)
                    dfs(graph,0,vis);
            }
           
            System.out.println();
            
    }
}

    