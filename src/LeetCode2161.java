import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetCode2161 {
    public static int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            list.add(nums[i]);
            int piInd=0;
        
            for(int i=0;i<nums.length;i++)
                if(nums[i]==pivot){
                    piInd=i;
                    break;
                }
            for(int i=0;i<nums.length;i++){
                if(nums[i]>pivot && i<piInd)
                {
                    //swapping
                    list.add(piInd-1,list.remove(i));
                }
                // if(nums[i]<pivot && i>piInd){
                //     int t=list.remove(i);
                //     list.add(piInd, t);

                // }
                if(nums[i]==pivot && pivot-nums[piInd+1]!=0)
                    list.add(piInd,list.remove(i));
                    System.out.println(list);

            }
            System.out.println(list);
            for(int i=0;i<list.size();i++)
                nums[i]=list.get(i);
            return nums;


    }
    public static void main(String[] args) {
        int[] nums=new int[]{9,12,5,10,14,3,10};
        int pivot=10;
        System.out.println(pivotArray(nums, pivot));
    }
}
