import java.util.*;
public class bfs{
    static class edge{
        int src;
        int dest;
        int wt;

        public edge(int s , int dest, int w){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static void creategrapth(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        //0 - vertex
        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        //1 vertex
        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,1));
       
        //2 vertex
        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(1,3,1));
       
        //3 vertex
        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,4,1));
        graph[3].add(new edge(3,5,1));

        //4 vertex
        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));

        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));
        graph[5].add(new edge(5,6,1));

        graph[6].add(new edge(6,5,1));
    }

    static void bfst(ArrayList<edge>[] graph){ //0(V+E) //0(n)
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            } 
        }
    }
    public static void dfs(ArrayList<edge>[] graph,int curr,boolean vis[]){
        //visit
        System.out.println(curr+" ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    

    public static boolean haspath(ArrayList<edge>[] graph , int src , int dest , boolean vis[]){
        if(src == dest){
            return true;
        }
        vis[src]=true;
        for(int i=0; i <graph[src].size();i++){
            edge e = graph[src].get(i);
            if(!vis[e.dest]&&haspath(graph,e.dest,dest,vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int V=7;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategrapth(graph);
        bfst(graph);  // 0 1 2 3  4 5  6
        dfs(graph,0,new boolean[V]);
        System.out.println(haspath(graph,0,5,new boolean[V]));
    

    }
}