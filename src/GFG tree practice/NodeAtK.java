import java.util.ArrayList;

public class NodeAtK {
    public static class Node{
        Node left;
        Node right;
        int key;
        Node(int k){
            key=k;
        }
    }

    static int lvl=-1;
    static ArrayList<Integer> list=new ArrayList<>();

    static ArrayList<Integer> helper(Node root,int k){
        if(root==null)
            return list;
        lvl++;
        if(lvl==k)
            list.add(root.key);
        helper(root.left,k);
        helper(root.right,k);
        lvl--;
        return list;


    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);

        System.out.println(helper(root,0).toString());

    //     time: O(n)
    //     space: O(h+1)
    }
}
