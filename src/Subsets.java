import java.util.*;

public class Subsets {
    static List<String> res = new ArrayList<>();

    static void helper(int[] input, ArrayList<Integer> output, int index) {
        if (index == input.length) {
            res.add(output.toString());  // Add a copy of output to res
            return;
        }

        helper(input, output, index + 1);
        output.add(input[index]);
        helper(input, output, index + 1);
        output.remove(output.size() - 1);
    }

    static List<String> findSubset(int[] arr) {
        res.clear();  // Clear previous results
        ArrayList<Integer> output = new ArrayList<>();
        helper(arr, output, 0);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(findSubset(arr));
    }
}
