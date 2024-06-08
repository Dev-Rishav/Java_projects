public class FirstEleOccurkTimes {
    public static int firstElementKTime(int n, int k, int[] a) {
        // implement two pointer spproach and find the element that is close
        // store the distance in a distArr
        //
        int start = 0, end, ind = 0;
        int[] distance = new int[n];
        int[] repNum=new int[n];
        int mini=Integer.MAX_VALUE,minInd=0;
        while (start < n) {     //storing the distance b/w the repeatations and keeping track of the number
            end=start+1;
            while (end < n) {
                if (a[start] == a[end]) {
                    // System.out.print("h");
                    distance[ind] = end-start;
                    repNum[ind++]=a[start];
                }
                end++;
            }
            start++;
        }   

        // for(int i: repNum)
        //     System.out.println(i);
        for(int i=0;i<distance.length;i++){     //find the shortest distance
            if(distance[i]==0)
                continue;
            if(mini>distance[i]){
            mini=distance[i];
            minInd=i;
            // System.out.println("ind"+minInd);
            }
        }
        return repNum[minInd];

    }

    public static void main(String[] args) {
        int[] a = new int[] { 1};
        int n = a.length;
        int k = 5;
        System.out.println(firstElementKTime(n, k, a));
    }
}
