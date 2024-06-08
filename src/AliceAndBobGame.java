import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AliceAndBobGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of elements in the array
            ArrayList<Integer> a = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                a.add(scanner.nextInt()); // Adding elements to the array list
            }
            
            int maxElement = Collections.max(a); // Finding the maximum element in the list
            System.out.println(maxElement); // Printing the maximum element
        }
        
        scanner.close(); // Closing the scanner to prevent resource leak
    }
}
