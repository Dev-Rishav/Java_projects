public class Sumofallsubstr {
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

    public static void main(String[] args) {
        String s = "123";
        System.out.println(sumOfSubstrings(s)); // Output: 164
    }
}
