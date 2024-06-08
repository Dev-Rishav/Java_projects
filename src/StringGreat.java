import java.util.ArrayList;
import java.util.Arrays;

public class StringGreat {
    public  static String makeGood(String s) {
        if(s.length()<2)
            return s;
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
            list.add(s.charAt(i));
        int start=0,end=0;
        while(start<=end && end<s.length()){
            if(Math.abs((int)s.charAt(start)-(int)s.charAt(end) )==32){
                list.remove(start);
                list.remove(start);
                System.out.println(start+" "+end);
                start=0;end=1;
                System.out.println(start+" "+end);
                // if(start!=0)
                //     start--;
                // end++;
            }
            else{
            start=end;
            end++;
            }
        }
        return list.toString();
    }

    public static void main(String[] args) {
        String str="abBAcC";
        System.out.println(makeGood(str));
    }
}
