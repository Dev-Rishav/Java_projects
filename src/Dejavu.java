import java.util.Scanner;

public class Dejavu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Length of the string
            int k = scanner.nextInt(); // Value of k
            String s = scanner.next(); // Binary string
            
            int result = findProperP(n, k, s);
            System.out.println(result);
        }
        
        scanner.close(); // Closing the scanner to prevent resource leak
    }
    
    private static int findProperP(int n, int k, String s) {
        // Iterate through possible values of p
        for (int p = 1; p <= n; p++) {
            if (n % p != 0) continue; // Only consider divisors of n
            
            // Apply the operation
            String reversed = reverseSubstring(s, p);
            String shifted = shiftCyclically(reversed, p);
            
            // Check if the result is k-proper
            if (isKProper(shifted, k)) {
                return p;
            }
        }
        return -1; // If no proper p is found
    }
    
    private static String reverseSubstring(String s, int p) {
        StringBuilder sb = new StringBuilder(s.substring(0, p));
        return sb.reverse().toString() + s.substring(p);
    }
    
    private static String shiftCyclically(String s, int p) {
        return s.substring(p) + s.substring(0, p);
    }
    
    private static boolean isKProper(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            if (i % k != 0 && s.charAt(i) == s.charAt(i % k)) {
                return false;
            }
        }
        return true;
    }
}
