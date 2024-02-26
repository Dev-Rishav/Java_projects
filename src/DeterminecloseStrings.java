import java.util.HashMap;

public class DeterminecloseStrings {
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char char1 = word1.charAt(i);
            char char2 = word2.charAt(i);

            map1.put(char1, map1.getOrDefault(char1, 0) + 1);
            map2.put(char2, map2.getOrDefault(char2, 0) + 1);
        }

        // Check if the sets of characters are the same
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        // Check if the frequencies of each character are the same
        for (int count : map1.values()) {
            if (!map2.containsValue(count)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = new String("abbzzca");
        String str2 = new String("babzzcz");
        System.out.println(closeStrings(str1, str2));
    }
}
