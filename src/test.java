import java.util.ArrayList;

public class test {
    static void helper(ArrayList<Integer> list,int t){
        list.add(1);
        t++;
    }
    public static void main(String[] args){
        // System.out.println("this is my first program");
        ArrayList<Integer> list=new ArrayList<>();
        int t=0;
        helper(list,t);
        System.out.println(list+" "+t);
    }
}
