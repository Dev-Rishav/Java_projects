import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine()); // Number of test cases
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine()); // Number of elements
            String[] arrStr = scanner.nextLine().split(" ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(arrStr[j]);
            }

            int count = Integer.MAX_VALUE;
            for (int j = 0; j < n - 1; j++) {
                int temp = Math.max(arr[j], arr[j + 1]);
                count = Math.min(count, temp);
            }
            result.add(count - 1);
        }

        for (int res : result) {
            System.out.println(res);
        }

        scanner.close(); // Closing the scanner to prevent resource leak
    }
}
