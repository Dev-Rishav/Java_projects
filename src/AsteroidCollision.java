import java.util.ArrayList;

public class AsteroidCollision {
    static int top = -1;
    static ArrayList<Integer> stack = new ArrayList<>();

    public static boolean checkSign(int x, int y) {
        if (x > 0 && y < 0)
            return true;
        else if (x < 0 && y > 0)
            return true;
        else
            return false;
    }

    public static void push(int x) {
        stack.add(x);
        top++;
    }

    public static int peek() {
        if (stack.isEmpty() || top == -1)
            return -1;
        return stack.get(top);
    }

    public static void pop() {
        if (top == -1 || stack.isEmpty())
            return;
        else {
            stack.remove(top);
            top--;
            System.out.println("Item popped successfully");
        }
    }

    public static int[] asteroidCollision(int[] asteroids) {
        for (int i = 0; i < asteroids.length; i++) {
            int ind = stack.size() - 1;
            if (stack.isEmpty()) {
                push(asteroids[i]);
            } else {
                while (ind >= 0 && !stack.isEmpty()) {
                    if (checkSign(peek(), asteroids[i])) {
                        if (Math.abs(peek()) < Math.abs(asteroids[i])) {
                            pop();
                        } else if (Math.abs(peek()) == Math.abs(asteroids[i])) {
                            pop();
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }

        }
        int[] res = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] as = new int[] { 5, 10, -5 };
        int[] res = asteroidCollision(as);
        for (int i : res)
            System.out.println(i);
    }
}
