import java.util.Stack;

public class Solution {
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    s = s.substring(0, i) + s.substring(i + 1);
                    i--;
                }
            }
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            s = s.substring(0, index) + s.substring(index + 1);
        }

        return s;
    }

    public static void main(String[] args) {
        String str = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(str)); 
    }
}
