import java.util.Arrays;

public class Kthprime {
    public static  int[] kthSmallestPrimeFraction(int[] arr, int k) {
      //create another modified array with given operation
      //sort that array
      //return the kth element

        float[] temp=new float[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                temp[i]=(float)arr[j]/(float)arr[i];
            }
        }
        Arrays.sort(temp);
        System.out.print(temp.toString());
        return temp;

    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5};
        int k=3;
        arr=kthSmallestPrimeFraction(arr, k);
        System.out.println(arr[0]+" "+arr[1]);
    }
}
