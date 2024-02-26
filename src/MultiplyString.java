

public class MultiplyString {
    public static String multiply(String num1, String num2) {
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int res=n1*n2;
        return Integer.toString(res);
    }
    public static void main(String[] args) {
        String num1=new String("2");
        String num2=new String("3");
        System.out.println(multiply(num1,num2));
    }
}
