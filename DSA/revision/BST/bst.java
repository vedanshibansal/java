import java.util.*;
public class bst{
    static class Node{
        int data ;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left,val);

        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data>key){
            return search(root.left , key);
        }else{
            return search(root.right , key);
        }

    }

    public static Node delete(Node root , int val){
        if(root.data < val){
            root.right = delete(root.right , val);
        }
        else if(root.data > val){
            root.left = delete(root.left , val);
        }
        else{
            //case 1 leaf 
            if(root.left == null && root.right == null ){
                return null;
            }
            //case 2 one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case3 both child
            Node IS = findIS(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }

    public static Node findIS(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printinrange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printinrange(root.left , k1 ,k2);
            System.out.print(root.data + " ");
            printinrange(root.right,k1,k2);
        }
        else if(root.data < k1){
            printinrange(root.left , k1,k2);
        }else{
            printinrange(root.right ,k1,k2);
        }
    }

    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void printroot2leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null ){
            printpath(path);
        }
        printroot2leaf(root.left,path);
        printroot2leaf(root.right,path);
        path.remove(path.size()-1);
    }
     

    public static boolean isvalidbst(Node root , Node min , Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isvalidbst(root.left , min , root)
                && isvalidbst(root.right , root , max);
    }

    public static Node createmirror(Node root){
        if(root == null){
            return null;
        }
        Node leftmirror = createmirror(root.left);
        Node rightmirror = createmirror(root.right);

        root.left = rightmirror;
        root.right = leftmirror;
        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length;i++){
            root = insert(root,values[i]);
        }
        /*inorder(root);
        System.out.println(); */

        /*if(search(root,1)){
            System.out.println("found");
        }else{
            System.out.println(" not found");
        }*/

        /*root = delete(root,5);
        System.out.println();

        inorder(root);  */

        //printinrange(root,5,12);

        //printroot2leaf(root , new ArrayList<>());

       /* if(isvalidbst(root,null,null)){
            System.out.print("valid");
        }else{
            System.out.print(" not valid");
        }*/

        root = createmirror(root);
        preorder(root);
    }

}