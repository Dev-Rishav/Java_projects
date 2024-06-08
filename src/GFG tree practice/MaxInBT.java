import java.lang.*;
public class MaxInBT {
 
    public static class Node{
        Node left;
        Node right;
        int key;
        Node(int k){
            key=k;
        }
    }


    static int maxi=Integer.MIN_VALUE;
    static int maxVal(Node root){
        // if(root==null)
        //     return 0;
        // // return Math.max(maxVal(root.left),maxVal(root.right));
        // maxVal(root.left);
        // maxVal(root.right);
        // maxi=Math.max(maxi,root.key);
        // return maxi;

        //Without using maxi vbariable 
         if(root==null)
            return 0;
        else    
            return Math.max(root.key,Math.max(maxVal(root.left),maxVal(root.right)));

    }


    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        System.out.println(maxVal(root));
    }
}
