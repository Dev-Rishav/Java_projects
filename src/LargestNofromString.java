
import java.util.*;
import java.io.*;

public class LargestNofromString {
    // static String printLargest(int n, String[] arr) {
                //Arrays.sort(arr, (num1,num2) -> ((num2+num1).compareTo(num1+num2)));

    //     // code here
    //     int ind = 0;
    //     Arrays.sort(arr, Collections.reverseOrder());
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }

    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             while (ind < Math.min(arr[i].length(), arr[j].length())) {


    //                 if ((int) arr[i].charAt(ind) < (int) arr[j].charAt(ind)) {
    //                     String temp = arr[j];
    //                     arr[j] = arr[i];
    //                     arr[i] = temp;
    //                 }
    //                 else if ((int) arr[i].charAt(ind) == (int) arr[j].charAt(ind) ){

    //                 }

    //                 else
    //                     break;
    //             }

    //             // if(arr[i].length()<arr[j].length()){
    //             //     String temp=arr[i];
    //             //     arr[i]=arr[j];
                    
    //             // }
    //         }
    //     }

    //     return String.join("", arr);

        
    // }

    static String printLargest(int n, String[] arr) {
        
        //Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
              if (arr[j].compareTo(arr[i]) > 0) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;  
              }
            }
          }
            return String.join("",arr);
          }
          
        //   private static boolean compareDescending(String str1, String str2) {
        //     String combined1 = str2 + str1;
        //     String combined2 = str1 + str2;
            

        //     return combined1.compareTo(combined2) > 0;
        //   }
        
        // StringBuilder ans=new StringBuilder();
        
        // for(String num: arr) ans.append(num);
        
        // return ans.toString();
    //     return String.join("", arr);
        
    // }

    // private static boolean compareDescending(int num1, int num2) {
    //     String combined1 = String.valueOf(num2) + String.valueOf(num1);
    //     String combined2 = String.valueOf(num1) + String.valueOf(num2);
    //     return combined1.compareTo(combined2) > 0;
    //   }
    public static void main(String[] args) {
        String[] arr = new String[] { "54", "546", "548", "60" };
        System.out.println(printLargest(arr.length, arr));
    }
}
