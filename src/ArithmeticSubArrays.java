import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArithmeticSubArrays {
    public static boolean checkFunc(int[] arr,int start,int end){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=start;i<=end;i++){
            temp.add(arr[i]);
        }
        Collections.sort(temp);
        int diff=temp.get(1)-temp.get(0);
        for(int i=2;i<temp.size();i++){
            if( (temp.get(i)-temp.get(i-1))!=diff )
                return false;
        }
        return true;
    }
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> res=new ArrayList<>(); 
        for(int i=0;i<l.length;i++){
            res.add(checkFunc(nums,l[i],r[i]));
        }  
        return res; 
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int[] l=new int[]{0,1,6,4,8,7};
        int[] r=new int[]{4,4,9,7,9,10};
        List<Boolean> res=new ArrayList<>();
        res=checkArithmeticSubarrays(nums, l, r);
        System.out.println(res);
    }
}
