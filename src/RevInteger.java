public class RevInteger {
    public static int reverse(int x) {
        if(x>2147483647 || x<-2147483648)
            return 0;
        StringBuilder str=new StringBuilder(Integer.toString(x));
        String res=new String();
        if(str.equals("-"))
            res.add(str.charAt(0)); 
    }
    public static void main(String[] args) {
        int x=-123;
        System.out.println(reverse(x));
    }
}
