public class MinInRotatedArray {
    public static int findMin(int[] nums) {
        int high = nums.length - 1, low = 0;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[high] <= nums[mid]) {
                if (nums[high] <= nums[low])
                    low = mid + 1;
                else
                    high = mid - 1;
                continue;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] < nums[high])
                    high = mid - 1;
                else
                    low = mid + 1;
                continue;
            }
            if (nums[mid] < nums[low]) {
                if (nums[mid] < nums[high])
                    high = mid;
                continue;
            }
        }
        return nums[mid];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 1, 2, 3};
        System.out.println(findMin(nums));
    }
}
