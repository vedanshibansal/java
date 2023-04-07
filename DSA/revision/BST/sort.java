import java.util.*;
public class sort{
    static class Node{
        int data ;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
     public static void getinorder(Node root,ArrayList<Integer> inorder){
        if(root == null){
            return ;
        }
        getinorder(root.left,inorder);
        inorder.add(root.data);
        getinorder(root.right,inorder);
    }
     public static Node createbst2(ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2 ;
        Node root = new Node(inorder.get(mid));
        root.left = createbst(inorder,st,mid-1);
        root.right = createbst(inorder,mid+1,end);
        return root;
    }

    public static Node balancebst(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root,inorder);
        root = createbst2(inorder,0,inorder.size()-1);
        return root;
    }
    public static void main(String args[]){
        Node root = new Node(data:8);
        root.left = new Node(data:6);
        root.left.left = new Node(data:5);
        root.left.left.left = new Node(data:3);

        root.right = new Node(data:10);
        root.right.right = new Node(data:6);
        root.right.right.right = new Node(data:12);

        root = balancebst(root);
        preorder(root);
    }
}

        
        
