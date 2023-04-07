import java.util.*;
public class ll{
    public static class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size ;

//addfirst
    public void addfirst1(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++ ;
        if(head == null){
            head = tail = newNode ; 
            return ;
        }
        //2 newNode.next = head
        newNode.next = head ;
        //3 head = newNode 
        head = newNode ;
    }

//add last
    public void addlast(int data){
        Node newNode = new Node(data);
        size++ ;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode ;
    }    

//addmiddle    
    public void add(int idx,int data){
        if (idx == 0){
            addfirst1(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++ ;
        Node temp =head;
        int i=0;
        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    } 

//remove first
    public int removefirst(){
        if(size == 0){
            System.out.println("ll is empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val ;
        }
        int val = head.data;
        head = head.next ;
        size-- ;
        return val;
    }    

//remove last
    public int removelast(){
        if(size == 0){
            System.out.println("ll is empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val ;
        }
        //prev => i=size-2
        Node prev = head ;
        for(int i=0 ; i<size-2; i++){
            prev =prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null ;
        tail = prev ;
        size-- ;
        return val;
    }
    
//iterative search
    public int itrsearch(int key){
        Node temp = head ;
        int i=0;
        while(temp!=null){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++ ;
        }
        return -1;
    }

//recursive search
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }

//reverse
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next =  curr.next;
            curr.next=prev;
            prev=curr;
            curr= next ;
        }
        head = prev;
    }


//delete n from end
    public static void deleteend(int n){
        int sz = 0 ;
        Node temp = head ;
        while(temp!=null){
            temp = temp.next;
            sz++ ;
        }
        if(n==sz){
            head = head.next;
            return ;
        }
        //sz-n
        int i=1;
        int itofind = sz-n;
        Node prev = head;
        while(i<itofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next ;
        return ;
    }

//palindrome
    public Node findmid(Node head){
        Node slow = head ;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;                  //+1
            fast = fast.next.next;             //+2
        }
        return slow;
    }
    public boolean checkpalindrome(){
        if(head == null || head.next == null){
            return true ;
        }
        //step1 mid node
        Node midNode = findmid(head);
        //step2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = next ;
        }
        Node right = prev;    //right half head
        Node left = head ;
        //step 3 checkleft half and right half
        while(right != null){
            if(left.data != right.data){
                return false ;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


//print function    
    public void print(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String args[]){
        ll ll2 = new ll();
        ll2.addfirst1(1);
        ll2.addfirst1(2);
        ll2.addfirst1(3);
        ll2.addfirst1(4);
        ll2.addlast(5);
        ll2.addlast(6);
        ll2.add(2,9);
    
        ll2.print();

       // ll2.removefirst();
        //ll2.print();

        //ll2.removelast();
        //ll2.print();

       // System.out.println(ll2.itrsearch(3));
       // System.out.println(ll2.itrsearch(19));

        //System.out.println(ll2.recsearch(3));
        //System.out.println(ll2.recsearch(19));

        //ll2.reverse();
        //ll2.print();

        //ll2.deleteend(3);
        //ll2.print();

        System.out.println(ll2.checkpalindrome());
        System.out.println(ll2.size);
    }    
}