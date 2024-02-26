public class MaxNoOfKsumpairs {
    public static int[] remove(int[] nums,int i1,int i2){
        int[] copy=new int[nums.length];
        int j=0,i;
        for(i=0;i<nums.length;i++){
            if(i==i1 || i==i2)
                continue;
            copy[j++]=nums[i];
        }
        copy[j]=nums[i1];
        copy[j+1]=nums[i2];
        display(copy, j-2);//debug
        return copy;
    }

    public static void display(int[] nums,int len){     //debug
        for(int i=0;i<len;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println();
    }


    public static int maxOperations(int[] nums, int k) {
        int count=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
               // System.out.println("count check");  //debug
            if((k-nums[i])==nums[j]){
                System.out.println("count check");      //debug
                //display(nums, len);         //debug
                nums=remove(nums,i,j);
                len=len-2;
                System.out.println(len);
               // display(nums,len);          //debug
                count++;
                if(len<=1)
                    return count;
                break;
            }
        }
    }
    return count;
}
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        int k=5;
        System.out.println("final result="+maxOperations(nums,k));
    }
}
