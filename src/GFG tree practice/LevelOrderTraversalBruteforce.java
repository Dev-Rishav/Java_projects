import java.util.ArrayList;

public class LevelOrderTraversalBruteforce {

public static class Node{
        Node left;
        Node right;
        int key;
        Node(int k){
            key=k;
        }
    }

    static void  helper(Node root, ArrayList<Integer> list,int lvl,int cl){
        if(root==null)
            return;
        if(cl==lvl){
            list.add(root.key);
            return;
        }
        cl++;
        helper(root.left, list, lvl, cl);
        helper(root.right, list, lvl, cl);
        cl--;
        return;
    }

    static int height(Node root){
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

    static ArrayList<Integer> lvlorderTrav(Node root,ArrayList<Integer> list,int height,int lvl){
        if(height<=lvl)
            return list;
        helper(root,list,lvl,0);
        lvl++;
        lvlorderTrav(root, list, height, lvl);
        return list;
    }


    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);

        ArrayList<Integer> list=new ArrayList<>();
        lvlorderTrav(root,list,height(root),0);
        System.out.println(list);
}

}
