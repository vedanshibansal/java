import java.util.*;
public class basic{
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size()-1; //x is child index
            int par = (x-1)/2; //parent index

            while(arr.get(x)<arr.get(par)){ //o(log n)
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minidx = i;

            if(left<arr.size()&&arr.get(minidx)>arr.get(left)){
                minidx = left;
            }
            if(right<arr.size()&&arr.get(minidx)>arr.get(right)){
                minidx = right;
            }
            if(minidx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);

                heapify(minidx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            //step1 swap 
            int temp = arr.get(0);
            arr.set(0,arr.size()-1);
            arr.set(arr.size()-1,temp);

            //step 2  delete last
            arr.remove(arr.size()-1);

            //step 3 heapify
            heapify(0);
            return data;

        }
        public  boolean isEmpty(){
            return false;
        }
    }
    public static void main(String  args[]){
        Heap h1 = new Heap();
        h1.add(3);
        h1.add(4);
        h1.add(1);
        h1.add(5);

        while(!h1.isEmpty()){
            System.out.println(h1.peek());
            h1.remove();
        }
    }
}