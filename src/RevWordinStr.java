public class RevWordinStr {
    public static String reverseWords(String input) {
        //create another string, place two pointer to last word( ignore spaces)
        //decrease the pointer until a single space appears
        //store that word  into the new string
          // Step 1: Split the input string into an array of words
          String[] words = input.split("\\s+"); // This uses whitespace as the delimiter
  
          // Step 2: Reverse the order of the words in the array
          int start = 0;
          int end = words.length - 1;
          while (start < end) {
              // Swap words[start] and words[end]
              String temp = words[start];
              words[start] = words[end];
              words[end] = temp;
              for (int i=0;i<words.length;i++)  //debug
            System.out.println(words[i]);      //debug
            System.out.println();       //debug
              // Move to the next pair of words
              start++;
              end--;
          }
  
          /// Step 3: Join the reversed words back into a string
          String reversedString = String.join(" ", words);
  
          // Step 4: Trim leading and trailing spaces
          return reversedString.trim();
      }
      public static void main(String[] args) {
        String s=new String("the sky is     ");
        System.out.println(reverseWords(s));
      }
}
