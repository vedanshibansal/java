import java.util.*;
public class window{
    static class pair implements Comparable<Pair>{
        int val;
        int idx;

        public pair(int val,int idx){
            this.val= val;
            this.idx= idx;

        }
        @Override
        public int compareTo(Pair p2){
            return p2.val - this.val;
        }
    }


    public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3 ;
        int res[] = new int[arr.length-k + 1];

        PriorityQueue<pair> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(new pair(arr[i]),i)
        }

    }
}