public class LeetCode41 {
    public static int fmp(int[] a){
        int len=a.length;
         for(int i=0;i<len;i++)
            if(a[i]<1 && a[i]>len)
                a[i]=len+1;
        
        for(int i=0;i<len;i++){
            int val=Math.abs(a[i]);
            if(val>0 && val<=len)
                if(a[val-1] >0)
                    a[val-1] = a[val-1] * (-1);
        }
        for(int i=0;i<len;i++)
            if(a[i]>=0)
                return i+1;
        return len+1;
    }

    public static void main(String[] args) {
        // int[] a=new int[]{7,8,9,11,12};
        int[] a=new int[]{1,2,0};
        System.out.println(fmp(a));
    }
}
