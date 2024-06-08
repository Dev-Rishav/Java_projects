public class LeetCode1750 {
    public static int minimumLength(String s) {
        char[] res=new char[s.length()];
        char[] arr=s.toCharArray();
        int start=0,end=s.length()-1;
        int len=s.length();
        while(start<len){
            while(end>=0){
                System.out.println("inner loop");
                if(start>=end)
                    break;
                if(arr[start]==arr[end]){
                    arr[start]='0';
                    arr[end]='0';
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
            start++;
        }
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='0')
                res[ind++]=arr[i];

        }
        return ind;
        
    }

    public static void main(String[] args) {
        String s=new String("aabccabba");
        System.out.println(minimumLength(s));
    }
}
