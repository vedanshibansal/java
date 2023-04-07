import java.util.*;
public class topological{
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
        graph[2].add(new edge(2,3));     
        graph[3].add(new edge(3,1));
        graph[4].add(new edge(4,0));
        graph[4].add(new edge(4,1));
        graph[5].add(new edge(5,0));
        graph[5].add(new edge(5,2));

        
    }
}