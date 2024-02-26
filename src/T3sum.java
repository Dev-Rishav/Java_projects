import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T3sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Fix the first pointer to the current element
            int target = -nums[i];
            int low = i + 1, high = nums.length - 1;

            // Use two pointers approach for the remaining subarray
            while (low < high) {
                int curSum = nums[low] + nums[high];

                if (curSum == target) {
                    // Found a triplet, add it to the result list
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    // Move pointers to avoid duplicates
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;

                    // Move pointers to the next unique elements
                    low++;
                    high--;
                } else if (curSum < target) {
                    // Increase low pointer if the sum is less than the target
                    low++;
                } else {
                    // Decrease high pointer if the sum is greater than the target
                    high--;
                }
            }

            // Move the first pointer to the next unique element to avoid duplicates
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);

        // Print the result
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
