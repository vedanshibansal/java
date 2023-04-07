public class avl{
    static class Node{
        int data, height;
        Node left , right;

        Node(int data){
            this.data = data;
            height = 1;

        }
    }
    public class Node root;

    public static int height(Node root){
        if(root == null)
            return 0;

        return root.height;
    }
    public static Node insert(Node root , int key){
        if(root == null){
            return new Node(key);
        }
        if(root.data>key){
            root.left = insert(root.left,key);

        }else if(key>root.data){
            root.right = insert(root.right,key);
        }else{
            return root;
        }
        root.height = 1+ Math.max(height(root.left),height(root.right));
        int bf = getbalance(root);
    }
    public static void main(String[] args){
        root = insert(root,key:10);
        root = insert(root,key:20);
        root = insert(root,key:30);
        root = insert(root,key:40);
        root = insert(root,key:50);
        root = insert(root,key:60);
    }
}