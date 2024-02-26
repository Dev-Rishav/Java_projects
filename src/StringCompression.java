public class StringCompression {
    public static  char[] chars=new char[]{'a','a','b','b','c','c','c'};
    public static int compress(char[] chars) {
        int count=1,ind;
        char element='a';
        StringBuilder str=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            if(i==0){
                element=chars[i];
                continue;
            }
            if(element==chars[i])
                count++;
            else{
                System.out.println(element);   //debug
                str.append(element);
                if(count>1)
                    str.append(count);
                count=1;
                element=chars[i];
            }
            if(i==chars.length-1){
                str.append(element);
                if(count>1)
                    str.append(count);
            }
        }
        for(ind=0;ind<str.length();ind++){
            chars[ind]=str.charAt(ind);
        }
        return ind;
    }
    public static void main(String[] args) {
        int ind=compress(chars);
        for(int i=0;i<ind;i++)
            System.out.print(chars[i]+" ");
    }
}
