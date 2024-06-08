import java.util.ArrayList;

public class Rabinkarp {
     static ArrayList<Integer> search(String pattern, String text)
    {
        ArrayList<Integer> res=new ArrayList<>();
        int ind=0;
        if(text.length()==1)
        {
            if(text.charAt(0)==pattern.charAt(0))
                res.add(1);
            return res;
        }
        for(int i=0;i<text.length();i++){
            // System.out.println("i"+i+" and ind="+ind);
            if(ind==pattern.length()-1){
                res.add(i-ind+1);
                
                i=i-ind;ind=0;
                continue;
            }
            if(text.charAt(i)==pattern.charAt(ind)){
                // System.out.println("yes"+i);
                ind++;
                continue;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String t=new String("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        String p=new String("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        ArrayList<Integer> res=search(p,t);
        for (int i: res){
            System.out.println(i);
        }
    }
}
