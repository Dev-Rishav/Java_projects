import java.util.ArrayList;

public class FindNthChar {
    public static char nthCharacter(String s, int r, int n)
    {
        //code here
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                list.add('0');
                list.add('1');
            }
            else{
                list.add('1');
                list.add('0');
            }
        }
        r--;
        while(r>0){
            int len=list.size()*2;
            for(int i=0;i<len;i+=2){
            if(list.get(i)=='0'){
                list.remove(i);
                list.add(i,'0');
                list.add(i+1,'1');
            }
            else{
                list.remove(i);
                list.add(i,'1');
                list.add(i+1,'0');
            }
            
        }
        r--;
        System.out.println(list.toString());        
        }
        return list.get(n);
    }

    public static void main(String[] args) {
        String s=new String("1000");
        int r=18,n=1;
        System.out.println(nthCharacter(s,r,n));
    }
}
