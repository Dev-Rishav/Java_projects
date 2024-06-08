import org.w3c.dom.Node;

public class sizeOfBT {
    public static class Node{
        Node left;
        Node right;
        int key;
        Node(int k){
            key=k;
        }
    }

    static int treeSize(Node root){
        if(root==null)
            return 0;
        return treeSize(root.left)+treeSize(root.right)+1;
    }



    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        System.out.println(treeSize(root));
    }
}
