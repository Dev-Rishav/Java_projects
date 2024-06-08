public class BintoGrey {
    public static StringBuilder decToBinary(int n) 
    { 
        // Size of an integer is assumed to be 32 bits 
        StringBuilder sb=new StringBuilder();
        for (int i = 31; i >= 0; i--) { 
            int k = n >> i; 
            if ((k & 1) > 0) 
                sb.append(1); 
            else
                sb.append(0); 
        } 
        return sb;
    }
    
    
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        StringBuilder sb=decToBinary(n);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if (res.isEmpty())
                res.append(sb.charAt(i));
            else{
                res.append(sb.charAt(i)^res.charAt(i-1));
            }
        }
        System.out.println(sb+"  "+res);
        String str=res.toString();
        int dec=Integer.parseInt(str,2);
        // System.out.println(dec);
        return dec;
        
}

public static void main(String[] args){
    System.out.println(grayToBinary(10));
}
}
