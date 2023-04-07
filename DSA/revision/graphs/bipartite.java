import java.util.*;
public class bipartite{
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
      
        //1 vertex
        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,3));  
        //2 vertex
        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,4));     
        //3 vertex
        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,4));
    
        graph[4].add(new edge(4,2));
        graph[4].add(new edge(4,3));
    }
    public static boolean isbipartite(ArrayList<edge>[] graph){
        int col[] = new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size();j++){
                        edge e = graph[curr].get(j);
                        if(col[e.dest] == -1){
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextcol;
                            q.add(e.dest);
                        }else if(col[e.dest] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        int V=5;
        ArrayList<edge>[] graph = new ArrayList[V];
        creategraph(graph);
        System.out.println(isbipartite(graph));
    }
}