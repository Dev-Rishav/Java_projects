import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        int[] res=new int[2];
        while(start<end){
            if((numbers[start]+numbers[end])==target){
                    System.out.print("ele");
                res[0]=start+1;
                res[1]=end+1;
                break;
            }
            else if((numbers[start]+numbers[end])>target)
                end--;
            else
                start++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{2,7,11,15};
        int target=17;
        int[] res=new int[2];
        res=twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }
}
