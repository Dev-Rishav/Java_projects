import java.util.ArrayList;

public class ElementFrequency {

    static ArrayList<Integer> stack = new ArrayList<>();
    static int top = -1;

    public static void push(int n) {
        stack.add(n);
        top++;
        System.out.println("Element pushed successfully");
    }

    public static int pop() {
        int res = 0;
        if (top == -1)
            System.out.println("Stack underflow");
        else {
            res = stack.get(top);
            stack.remove(top--);
            System.out.println("Element popped successfully");
        }
        return res;
    }

    public static int evalRPN(String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int b = pop();
                int a = pop();
                if (tokens[i].equals("+")) {
                    push(a + b);
                } else if (tokens[i].equals("-")) {
                    push(a - b);
                } else if (tokens[i].equals("*")) {
                    push(a * b);
                } else {
                    push(a / b);
                }
            } else {
                push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.get(top);
    }

    public static void main(String[] args) {
        String[] str = new String[]{"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(str));
    }
}
