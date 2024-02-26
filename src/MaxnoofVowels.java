public class MaxnoofVowels {

    public static int maxVowels(String s, int k) {
        int vowel =0,maxV=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vowel++;
            }
            if(i%k==0 && i!=0 ){
                maxV=Math.max(maxV,vowel);
                if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u')
                    vowel--;
            }
            
            System.out.println("Vowel= "+vowel+" Maxv= "+maxV);
        }
        return maxV;
    }
    public static void main(String[] args) {
        String s=new String("abciiidef");
        int k=3;
        System.out.println(maxVowels(s,k));
    }
}