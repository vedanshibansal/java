import java.util.*;
public class deques{
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first ele = "+ deque.getFirst());
        System.out.println("last ele = "+ deque.getLast());


    }
}