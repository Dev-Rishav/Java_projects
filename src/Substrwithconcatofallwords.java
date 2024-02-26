import java.util.ArrayList;
import java.util.List;

public class Substrwithconcatofallwords {

     public static List<Integer> findSubstring(String s, String[] words) {
        //break the strings into length words[0] string arrays
        //check if the strings in the given arrays match
        String[] arr=s.split("",words[0].length());
        
    }
    public static void main(String[] args) {
        String s=new String("barfoofoobarthefoobarman");
        String[] words=new String[]{"bar","foo","the"};
        List<Integer> res=new ArrayList();
        res=findSubstring(s,words);
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
    }
}