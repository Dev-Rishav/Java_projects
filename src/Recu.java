public class Recu {
    // public static long sumSubstrings(String s) {
    //     return dp(s, 0, 0, 0, 1000000007);
    // }
    
    // public static long dp(String s, int index, long num, long sum, int modulo) {
    //     if (index==s.length()) {
    //         return sum;
    //     }
    //     int d =s.charAt(index)-'0';
    //     num =(num * 10 + d * (index + 1)) % modulo;
    //     sum = (sum + num) % modulo;

    //     return dp(s, index + 1, num, sum, modulo);
    // }

    // public static void main(String[] args) {
    //     String str=new String("1234");
    //     System.out.println(sumSubstrings(str));
    // }

    public static long sumSubstrings(String s)
    {
    //Your code here
        int modulo = 1000000007;
        int n = s.length();
        long res = 0;
        long[] window = new long[n]; 
        window[0] = s.charAt(0) - '0';
        res += window[0];
        for (int i = 1; i < n; i++) {
            int d = s.charAt(i) - '0';
            window[i] = (window[i - 1] * 10 + d * (i + 1)) % modulo;
            res = (res + window[i]) % modulo;
        }
        return res;
    }


}
