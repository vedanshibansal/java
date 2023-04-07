import java.util.ArrayList;
public class college{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null ;
        }

        //push
        public static int push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return -1;
            }
            newNode.next = head;
            head = newNode;
            return head ;
        }
    }
    public static void main(String args[]){
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
           

            
        }
    }