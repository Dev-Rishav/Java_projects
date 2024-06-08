public class Garbage {
    public static int garbageCollection(String[] garbage, int[] travel) {
        //glass truck
        int gCount=0,gInd=0,pCount=0,pInd=0,mCount=0,mInd=0;
        for(int i=0;i<garbage.length;i++){
            for(int j=0;j<garbage[i].length();j++){
                if(garbage[i].charAt(j)=='G'){
                    gCount++;
                    gInd=i;
                }
                if(garbage[i].charAt(j)=='P'){
                    pCount++;
                    pInd=i;
                }
                if(garbage[i].charAt(j)=='M'){
                    mCount++;
                    mInd=i;
                }

            }
        }
        for(int i=0;i<travel.length;i++){
            if(i<gInd)
            gCount+=travel[i];
            if(i<pInd)
                pCount+=travel[i];
            if(i<mInd)
                mCount+=travel[i];
        
        }
        return gCount+pCount+mCount;

    }


    public static void main(String[] args) {
        String[] g=new String[]{"MMM","PGM","GP"};
        int[] travel=new int[]{3,10};
        System.out.println(garbageCollection(g,travel));
    }
}
