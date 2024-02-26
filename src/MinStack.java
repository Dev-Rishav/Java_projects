import java.util.ArrayList;

public class MinStack {

    private int top;
    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStack;

    public MinStack() {
        top = -1;
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        top++;
        stack.add(val);

        if (minStack.isEmpty() || val <= minStack.get(minStack.size() - 1)) {
            minStack.add(val);
        }

        System.out.println("Push operation done successfully");
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            int poppedValue = stack.get(top);
            stack.remove(top);
            top--;

            if (poppedValue == minStack.get(minStack.size() - 1)) {
                minStack.remove(minStack.size() - 1);
            }

            System.out.println("Pop operation done successfully");
        }
    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return stack.get(top);
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return minStack.get(minStack.size() - 1);
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(3);
        obj.push(5);
        obj.push(2);
        obj.push(1);

        System.out.println("Top element: " + obj.top()); // Output: 1
        System.out.println("Minimum element: " + obj.getMin()); // Output: 1

        obj.pop();
        System.out.println("After pop:");
        System.out.println("Top element: " + obj.top()); // Output: 2
        System.out.println("Minimum element: " + obj.getMin()); // Output: 2
    }
}   
