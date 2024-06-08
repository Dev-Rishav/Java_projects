public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum=0,len=nums.length;
        for (int i =0;i<len;i++){
            sum+=nums[i];
            nums[i]=sum;
            // System.out.println(nums[i]);
        }
        int max=nums[len-1];
        for(int i=1;i<len;i++){
            System.out.println(max);
            if(nums[i-1]==(max-nums[i]))
                return i;
        }
        if(max-nums[0]==0)
            return 0;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-1,-1,0,1,1,-1};
        System.out.println(pivotIndex(nums));
    }
}
