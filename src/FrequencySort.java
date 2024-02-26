import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencySort {
    public static String frequencySort(String s) {
        // input all the entries into a hashmap
        // sort the hashmap in descending order
        // store into a string according to the frequency
        StringBuilder str=new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i), 1);
        }
        int size = map.size();
        while (size-- > 0) {
            char element = 0;
            int freq = 0;
            for (Map.Entry<Character, Integer> et : map.entrySet()) {
                if (et.getValue() > freq || (et.getValue() == freq && et.getKey() > element)) {
                    element = et.getKey();
                    freq = et.getValue();
                }
            }while(freq-- >0){
                str.append(element);
            }
            map.remove(element);
        } 
        return str.toString();

    }

    public static void main(String[] args) {
        String s = new String("Aabb11");
        System.out.println(frequencySort(s));

    }
}
