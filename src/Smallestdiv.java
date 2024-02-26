import java.lang.Math;
public class Smallestdiv{
    public static boolean checkDiv(int[] nums,int mid,int threshold){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((float)nums[i]/mid);
            System.out.println(sum);        //debug
        }
        System.out.println(); //debug
        return sum<=threshold;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        //find the max from the array
        //apply binary search and check for the middle elements if they are producing the sum that is smaller than all the total_sums
        //return the total_sum that is smallest
        int high=Integer.MIN_VALUE,low=1,mid;
        if(nums.length>threshold)
            return -1;
        for(int i=0;i<nums.length;i++){ //finding the max element
            high=Math.max(high,nums[i]);
        }
        while(low<=high){
            mid=(low+high)/2;
            if(checkDiv(nums,mid,threshold)){
                high=mid-1;
            }
            else    
                low=mid+1;
        }
        return low;
    }
    public static void main(String[] args){
        int[] nums=new int[]{1,2,5,9};
        int threshold=6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}