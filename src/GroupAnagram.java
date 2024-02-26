import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store groups of anagrams
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : strs) {
            // Sort the characters of the word
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Check if the sorted word is already in the map
            if (!anagramGroups.containsKey(sortedWord)) {
                // If not, create a new list for this anagram group
                anagramGroups.put(sortedWord, new ArrayList<>());
            }

            // Add the word to the corresponding anagram group
            anagramGroups.get(sortedWord).add(word);
        }

        // Convert the map values to a list of lists
        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] inputArray = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = groupAnagrams(inputArray);

        // Print the result
        for (List<String> group : res) {
            System.out.println(group);
        }
    }
}
