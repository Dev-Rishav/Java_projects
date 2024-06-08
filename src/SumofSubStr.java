public class SumofSubStr {

    public static long dp(String s,long[] arr,int ind,int modulo,long sum)
    {
        if(ind == s.length())
            return sum;
        int d=s.charAt(ind) - '0';
        arr[ind]=( arr[ind-1]*10+d*(ind+1)) % modulo;
        sum=(sum+arr[ind]) % modulo;
        // System.out.println("sum= "+sum);
        ind++;
        return dp(s, arr, ind, modulo, sum);
    }
    public static long sumSubstrings(String s)
    {
    //Your code here
        long[] arr=new long[s.length()];
        arr[0]=s.charAt(0) - '0';
        return arr[0] + dp(s,arr,1,1000000007,0);
    }

    public static void main(String[] args) {
        String str=new String("1234");
        System.out.println(sumSubstrings(str));
    }
}
