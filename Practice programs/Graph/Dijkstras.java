import java.security.Permissions;
import java.util.*;
public class Dijkstras {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    public static class Pair implements Comparable<Pair>{
        int node; 
        int dest;
        public Pair(int n, int d){
            this.node=n;
            this.dest=d;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dest - p2.dest;
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src, int s){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[]= new int[s];
        for(int i=0;i<s;i++){
            if(i!=src)
                dist[i]= Integer.MAX_VALUE;
        }
        boolean vis[] = new boolean[s];

        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(dist[u]+e.wt<dist[v]){
                        dist[v]=dist[u]+e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for(int i =0 ;i<s;i++){
            System.out.println(dist[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[]) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
       dijkstra(graph, 0,v);
        // for(int i=0; i<dist.length; i++) {
        //     System.out.println(dist[i]+" ");
        // }
    }
}