public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int[] freqS = new int[128]; 
        int[] freqT = new int[128]; 
        int len = s.length();
        for(int i = 0; i < len; i++) {
            if(freqS[(int)s.charAt(i)] != freqT[(int)t.charAt(i)]) {
                return false;
            }
            freqS[(int)s.charAt(i)] = i + 1; 
            freqT[(int)t.charAt(i)] = i + 1; 
        }
        for(int i=0;i<freqS.length;i++){
            if(freqS[i]!=0)
            System.out.println("FreqS= "+freqS[i]);
            if(freqT[i]!=0)
                System.out.println("FreqT= "+freqT[i]);
        }
        return true;
    }


    public static void main(String[] args) {
        String s=new String("paper");
        String t=new String("title");
        System.out.println(isIsomorphic(s, t));
    }
}
