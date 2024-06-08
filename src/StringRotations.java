import java.util.HashMap;

public class StringRotations {
    
    public static boolean areRotations(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map1.containsKey(s1.charAt(i)))
                map1.put( s1.charAt(i),map1.get(s1.charAt(i))+1 );
            else
                map1.put(s1.charAt(i),1);
        }
        for(int i=0;i<s2.length();i++){
            if(map2.containsKey(s2.charAt(i)))
                map2.put( s2.charAt(i),map2.get(s2.charAt(i))+1 );
            else
                map2.put(s2.charAt(i),1);
        }
        return map1.equals(map2);

    }

    public static void main(String[] args) {
        String s1=new String("geeksforgeeks");
        String s2=new String("forgeeksgeeks");
        System.out.println(areRotations(s1,s2));

    }
}
