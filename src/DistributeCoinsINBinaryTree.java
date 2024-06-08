import org.w3c.dom.Node;

public class DistributeCoinsINBinaryTree{

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public  static int distributeCoins(TreeNode root) {
        
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(0);
        root.right=new TreeNode(0);
        // root.right.left=new TreeNode(40);
        // root.right.right=new TreeNode(50);



    }
}