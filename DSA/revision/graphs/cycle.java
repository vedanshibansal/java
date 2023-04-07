import java.util.*;
public class cycle{
    static class edge{
        int src;
        int dest;
        public edge(int s , int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    static void creategraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        //0 - vertex
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));
        graph[0].add(new edge(0,3));
        //1 vertex
        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,2));  
        //2 vertex
        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,1));     
        //3 vertex
        graph[3].add(new edge(3,0));
        graph[3].add(new edge(3,4));
    
        graph[4].add(new edge(4,3));

    }
    public static boolean detectcycle(ArrayList<edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectcycleUtil(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectcycleUtil(ArrayList<edge>[] graph,boolean vis[],int curr,int par){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);

            //case 3
            if(!vis[e.dest]){
                if(detectcycleUtil(graph,vis,e.dest,curr))
                return true;
            }
            //case 1
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
            //case 2 -> do nothing -> continue
        }
        return false;
    }
    public static void main(String args[]){
        int V=5;
        ArrayList<edge>[] graph = new ArrayList[V];
        creategraph(graph);
        System.out.println(detectcycle(graph));
    }
}