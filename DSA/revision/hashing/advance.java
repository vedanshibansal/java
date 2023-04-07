import java.util.*;
public class advance{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node (K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int size;
        private int arr[];
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked");
        public HashMap(){
            this.size = 0;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        public void put(K key , V value){
            

        }
        public boolean containskey(K key){

        }
        public V remove(K key){
            return null;
        }
        public V get(K key){

        }

    }
}