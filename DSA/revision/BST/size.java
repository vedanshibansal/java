import java.util.*;
public class size{
    static class Node{
        int data ;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class info{
        boolean isbst;
        int size;
        int min;
        int max;

        public info(boolean isbst , int size, int min,int max){
            this.isbst = isbst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxbst = 0;

    public static info largestbst(Node root){
        if(root == null){
            return new info (isbst:true , size:0 , Integer.MAX_VALUE , Integer.MIN_VALUE);
        }
        info leftinfo = largestbst(root.left);
        info rightinfo = largestbst(root.right);
        int size = leftinfo.size + rightinfo.size+ 1;
        int min = Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
        int max = Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));
        

        if(root.data <= leftinfo.max || root.data >= rightinfo.min){
            return new info (isbst:false , size , min , max);
        }
        if(leftinfo.isbst && rightinfo.isbst){
            maxbst = Math.max(maxbst , size);
            return new info (isbst : true , size , min , max);
        }
        return new info(isbst:false , size , min , max);
    }

    public static void main(String args[]){
        Node root = new Node(data : 50);
        root.left = new Node(data : 30);
        root.left.left = new Node(data : 5);
        root.left.right = new Node(data : 20);

        root.right = new Node(data:60);
        root.right.left = new Node(data:45);
        root.right.right.left = new Node(data:65);
        root.right.right.right = new Node(data:80);
        

        info info = largestbst(root);
        System.out.println("largest bst size is = "+maxbst);
        

    }
}