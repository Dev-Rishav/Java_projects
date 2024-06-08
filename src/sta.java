import java.util.*;

public class sta{
    public static void main(String[] args){
        Stack<Integer> st1=new Stack<>();
        st1.push(512);
        st1.push(-1024);
        st1.push(-1024);
        st1.push(512);
        Stack<Integer> st2=new Stack<>();
        st2.push(512);
        st2.push(-1024);
        st2.push(-1024);

        st1.pop();
        System.out.println(st1);
        System.out.println(st2);
        if(st1.peek()==st2.peek())
            System.out.println(st1.peek()+" "+st2.peek());
    }
}