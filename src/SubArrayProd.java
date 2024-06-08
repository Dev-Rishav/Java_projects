public class SubArrayProd {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod=1,count=0,start=0,end=0;
        int len=nums.length;
        boolean flag=false;
        while(start<=end && end<len){
            if(nums[end]>k){
                if(flag)//first dig being counted twice
                {
                    count--;
                    flag=false;
                }
                start=end+1;
                end++;
                prod=1;
                continue;
            }
            count++;
            flag=true;
            // System.out.print("yres");
            prod*=nums[end];
            if(prod<k){
                count++;
                end++;
            }
            else{
                prod/=nums[start];
                prod/=nums[end];
                start++;
                count--;
            }
        }
        if(flag)//first dig being counted twice
            count--;    
        if (end-start-2>0)
            count+=(end-start-2);
        return count;
    }
    
    public static void main(String[] args) {
        int[] n=new int[]{9,1,2,7,3};
        int k=200;
        System.out.println(numSubarrayProductLessThanK(n,k));
    }
}
