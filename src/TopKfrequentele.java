import java.util.*;

public class TopKfrequentele {
    public static int[] topKFrequent(int[] nums, int k) {
        ArrayList res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i], 1);
        }
        for(Map.Entry<Integer,Integer> set: map.entrySet()){
            if(set.getValue()>=k)
                res.add(set.getKey());
        }
        int[] resa=new int[res.size()];
        for(int i=0;i<res.size();i++)
            resa[i]=(int) res.get(i);
        if(resa.length==0)
            return nums;
        return resa;
        
    }
    public static void main(String[] args) {
        int[] nums=new int[]{3,0,1,0};
        int[] res=new int[nums.length];
        int k=1;
        res=topKFrequent(nums,k);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
}
