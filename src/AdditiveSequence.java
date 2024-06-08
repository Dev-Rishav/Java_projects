public class AdditiveSequence {
    public static boolean isAdditiveSequence(String n) {
        // code here
        int sum,len=n.length(),f=0,s=1;;
        for(int i=0;i<len;i++){
            sum=(int)n.charAt(f)+(int)n.charAt(s);
            for(int j=0)
        }
        
        
        return false;
    }
    
    public static void main(String[] args) {
        String str=new String("1235813");
        System.out.println(isAdditiveSequence(str));
    }
}
