public class recursion {
    public static long sumSubstrings(String s) {
        return dp(s, 0, 0, 0, 1000000007);
    }
    
    public static long dp(String s, int index, long num, long sum, int modulo) {
        if (index==s.length()) {
            return sum;
        }
        int d =s.charAt(index) - '0';
        num =(num * 10 + d * (index + 1)) % modulo;
        sum = (sum + num) % modulo;
        return dp(s, index + 1, num, sum, modulo);
    }
    public static void main(String[] args) {
        String str=new String("69696");
        System.out.println(sumSubstrings(str));
    }
}
