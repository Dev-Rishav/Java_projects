import java.util.HashMap;

public class Longestsubstring{
    /*public static int lengthOfLongestSubstring(String s) {
        int low,high,len=1,maxl=Integer.MIN_VALUE;
        low=0;
        high=low+1;
        while(high<s.length()){
            //System.out.println(s.charAt(low+1)==s.charAt(high)); //debug
            if(high == s.length()-1){
                if(((int)s.charAt(low)+1)==s.charAt(high)){
                len++;
                maxl=Math.max(len,maxl);
                break;
            }
            }
            if(((int)s.charAt(low)+1)==s.charAt(high)){
                high++;
                len++;
                low++;
            }
            if(((int)s.charAt(low)+1)!=s.charAt(high)){
                low=high;
                high++;
                //System.out.println(len);        //debug
                maxl=Math.max(len,maxl);
                len=1;
            }
        }
        return maxl;

    }*/
   /*  public static int lengthOfLongestSubstring(String s){
        int pivot=0,len=1,maxl=Integer.MIN_VALUE;
        while(pivot<s.length()){
            if(pivot==s.length()-1)
                break;
            if(s.charAt(pivot)!=s.charAt(pivot+1)){
                len++;
                pivot++;
            }
            else{
                maxl=Math.max(len,maxl);
                len=1;
                pivot++;

            }
        }
        return maxl;
    }*/
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int len=0,maxl=Integer.MIN_VALUE;
        int i=0,j=0;
        while(j<s.length() && i<s.length()){
            boolean flag=false;
            if(map.containsKey(s.charAt(i))){
                maxl=Math.max(maxl,len);
                len=0;
                map.clear();
                flag=true;
                j++;
                i=j;
            }
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
                len++;
                System.out.println(len);
            }
            if(flag==false && i+1==s.length()){
                maxl=Math.max(maxl,len);
                continue;
            }
            i++;
        }
        return maxl;
    }
    public static void main(String[] args) {
        String s=new String("pwwkew");
        System.out.println(lengthOfLongestSubstring(s));
    }
}