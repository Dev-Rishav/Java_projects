import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class test3 {
    public static void main(String[] args) {
        String s=new String("(){}[])");
       
        
         Stack<Character> stack=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else{
                if( Math.abs( (int)stack.peek()-(int)s.charAt(i) )==1 || Math.abs( (int)stack.peek()-(int)s.charAt(i)) ==2 )
                    System.out.print(stack.pop()+"yes");
                else
                    stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty())
            System.out.println(true);
        else
            System.out.println("false");


    }
}
