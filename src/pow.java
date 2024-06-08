import java.util.ArrayList;

public class pow {
        public static double myPow(double x, int n,double fv) {
            ArrayList<String> l=new ArrayList<>();
            if(n==1 || n==-1)
                return x;
            if(n>1){
                l.add(myPow((double)x*(double)fv,n-1,fv));
            }
            else{
                x=((myPow( (double)(1/x)*(double)(1/fv), n+1, fv)));
            }
            return x;
        }

    public static void main(String[] args) {
        double x=34.00515,fv=34.00515;int n=-2;
        System.out.println(myPow(x,n,fv));
        System.out.println(Math.pow(x,n));
    }
}
