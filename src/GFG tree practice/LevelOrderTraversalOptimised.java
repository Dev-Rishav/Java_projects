import java.util.*;



public class LevelOrderTraversalOptimised {

    public static class Node{
        Node left;
        Node right;
        int key;
        Node(int k){
            key=k;
        }
    }

    static void printLevel(Node root){
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            System.out.println(q.peek().key);
            Node curr=q.poll();
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        printLevel(root);
}
}
