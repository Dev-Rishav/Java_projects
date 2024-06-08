import java.util.*;;
public class FirstSetBit {
    public static int getFirstSetBit(int n){
        int count=0;
        ArrayList<Charac> b=new ArrayList<Integer>();   
        // Your code here
        while(n>0){
            b.add(n%2);
            n/=2;
        }

        for (char c: b){
            if(c=='0')
                count++;
            else
                break;
        }
        return count+1;
            
    }

    public static void main(String[] args) {
        System.out.println(getFirstSetBit(18));
    }
}
