import java.util.*;
import java.io.*;
public class LeetCodeInterface {
    static int l=0;
    public static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot)
                list.add(nums[i]);
        }
        int si=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                if(si==0){
                    list.addFirst(nums[i]);
                    si++;
                }
                else{
                    list.add(si-1,nums[i]);
                    si++;
                }
            }
            if(nums[i]>pivot){
                list.add(nums[i]);
            }
        }
        System.out.println(list);
        int[] res = list.stream().mapToInt(i->i).toArray();
        return res;
    }


    public static void main(String[] args) {
        int[] n=new int[]{9,12,5,10,14,3,10};
        int p=10;
        n=pivotArray(n, p);
        System.out.println(++l);
        // for(int i=0;i<n.length;i++)
        //     System.out.println(n[i]+" ");
    }
}