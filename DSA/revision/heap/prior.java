import java.util.*;
public class prior{
    static class student implements Comparable<student>{
        
        int rank;

        public student( int rank){
            
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<student> pq = new PriorityQueue();
        pq.add(new student(4));
        pq.add(new student(5));
        pq.add(new student(2));
        pq.add(new student(12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().rank);
            pq.remove();
        }


    }
}