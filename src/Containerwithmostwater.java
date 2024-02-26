public class Containerwithmostwater {
    public static int maxArea(int[] height) {
        int maxn=Integer.MIN_VALUE;
        int high=height.length-1,low=0;
        int l,b;
        while(high!=low){
            l=Math.min(height[low],height[high]);
            b=high-low;
            maxn=Math.max(l*b,maxn);
            //System.out.println(l*b); //debug
          if(height[low]<height[high])
              low++;
          else
              high--;
        }  
        return maxn;
      }
    public static void main(String[] args) {
        int[] height=new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
