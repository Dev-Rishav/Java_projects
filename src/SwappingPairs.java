import java.util.*;


class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        int sumA = 0, sumB = 0;
        // find sum of both the arrays
        for (int i = 0; i < n; i++)
            sumA += a[i];
        for (int i = 0; i < m; i++)
            sumB += b[i];
        int diff = Math.abs(sumA - sumB);
        // find the pair according to the difference
        for (int i = 0; i < n; i++) {
            int start = 0, end = m - 1; // apply binarysearch to find the other half
            int otherHalf = (int) diff - (int) a[i];
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (b[mid] == otherHalf)
                    return 1;
                if (b[mid] < otherHalf)
                    start = mid + 1;
                else
                    end = mid - 1;

            }
        }
        return -1;
    }
}
