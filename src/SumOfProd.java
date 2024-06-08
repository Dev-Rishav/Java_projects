public class SumOfProd {
    static long pairAndSum(int n, int arr[]) {
        // code here
 
            // To store the required sum
            long sum = 0;
         
            // For every element of the array
            for (int i = 0; i < n; i++) 
            {
         
                // It appears (2 * n) times
                sum = sum + (arr[i] & (2 * n));
            }
         
            return (long)sum;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2};
        System.out.println(pairAndSum(arr.length, arr));
    }
}
