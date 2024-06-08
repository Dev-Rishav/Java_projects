import java.util.ArrayList;
import java.util.List;

public class ReverseBits {
    static Long reversedBits(Long x) {
        // code here
        StringBuilder sb=new StringBuilder();
        for (int i = 31; i >= 0; i--) { 
            long k = x >> i; 
            if ((k & 1) > 0) 
                sb.append(1); 
            else
                sb.append(0); 
        }
        sb.reverse();
        System.out.println(sb);
        String str=sb.toString();
        long res=Long.parseLong(str,2);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reversedBits((long)1));
        // List<Integer> l=new ArrayList<>();
        // l.addFirst
    }
}
