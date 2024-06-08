

public class InorderTraversal {
    public static class Node{
        Node left;
        Node right;
        int key;
        Node(int k){
            key=k;
        }
    }

    static void inorderTrav(Node root){
        if(root==null)
            return;
        inorderTrav(root.left);
        System.out.print(root.key+" ");
        inorderTrav(root.right);
    }

    static void preorderTrav(Node root){
        if(root==null)
            return;
        System.out.print(root.key+" ");
        preorderTrav(root.left);
        preorderTrav(root.right);
    }

    static void postorderTrav(Node root){
        if(root ==null)
            return;
        postorderTrav(root.left);
        postorderTrav(root.right);
        System.out.print(root.key+" ");
        
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        // inorderTrav(root);

        // preorderTrav(root);

        postorderTrav(root);


    }

    // Time Complexity : O(n)
    // Space Complexity : O(height of binary tree " 4 here") i.e. O(h)
}
