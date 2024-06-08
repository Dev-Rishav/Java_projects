import java.util.Scanner;

public class xoro {
    
    public static int leastSignificantSetBit(int num) {
        if (num == 0) {
            return 0;
        }
        return Integer.numberOfTrailingZeros(num) + 1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int xorValue = x ^ y;
            int lsbPosition = leastSignificantSetBit(xorValue);
            int longestCommonSubsequence = 1 << (lsbPosition - 1);
            System.out.println(longestCommonSubsequence);
        }
        
        scanner.close(); // Closing the scanner to prevent resource leak
    }
}
