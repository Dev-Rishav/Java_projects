import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt(); // Number of test cases

        while (test-- > 0) {
            sol(scanner);
        }

        scanner.close(); // Closing the scanner to prevent resource leak
    }

    private static void sol(Scanner scanner) {
        int n = scanner.nextInt(); // Number of elements
        long[] v = new long[n];

        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextLong(); // Read elements
        }

        long x = 1;

        for (long val : v) {
            long y = gcd(x, val);
            y = val / y;
            x *= y;
        }

        long sum = 0;
        List<Long> ans = new ArrayList<>();

        for (long val : v) {
            long quotient = x / val;
            sum += quotient;
            ans.add(quotient);
        }

        if (sum >= x) {
            System.out.println(-1);
        } else {
            for (long val : ans) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
