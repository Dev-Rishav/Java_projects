import java.util.*;

public class Icpc {
    private static final int MOD = 1000000007; // Modulo value

    public static int get_ans(int n, List<Integer> A, int q, int t, List<List<Integer>> queries) {
        int sum = 0;

        // Initialize a frequency array to store element counts (1-based)
        int[] freq = new int[21];
        for (int num : A) {
            freq[num]++;
        }

        for (List<Integer> query : queries) {
            if (query.get(0) == 1) { // Type 1 query: Check subarray goodness
                int l = query.get(1) - 1; // Adjust indices for 0-based array
                int r = query.get(2) - 1;

                boolean good = true;
                int maxOddFreq = 0; // Track the maximum odd frequency

                for (int i = 2; i <= 20; i++) {
                    // Check if all element frequencies are even or an odd frequency is <= 1
                    maxOddFreq = Math.max(maxOddFreq, freq[i] % 2);
                    if (freq[i] % 2 != 0 && freq[i] > 1) {
                        good = false;
                        break;
                    }
                }

                if (good && maxOddFreq <= 1) {
                    sum = (sum + (r - l + 1)) % MOD; // Add subarray length (modulo)
                }
            } else if (query.get(0) == 2) { // Type 2 query: Replace element
                int l = query.get(1) - 1;
                int newVal = query.get(2);

                freq[A.get(l)]--; // Decrement frequency of old element
                A.set(l, newVal); // Update element in the list
                freq[newVal]++;   // Increment frequency of new element
            }
        }

        return sum;
    }

 
    public static void main(String[] args) {
        // Sample input
        int n = 5;
        List<Integer> A = Arrays.asList(1, 2,2,4,2);
        int q = 5;
        int t = 3;
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1, 1, 1));
        queries.add(Arrays.asList(1, 2, 5));
        queries.add(Arrays.asList(2,1,10)); 
        queries.add(Arrays.asList(2,3,15));
        queries.add(Arrays.asList(1, 1,4));       

        int result = get_ans(n, A, q, t, queries);
        System.out.println(result); // Output: 4
}
}