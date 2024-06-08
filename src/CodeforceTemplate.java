import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//import this in current class and make an object of the current class to use it as non-static reference

class FastReader {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    String next() {
        while (!st.hasMoreTokens())
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
            }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }
}




public class CodeforceTemplate {
    public static void main(String[] args) {
        FastReader f = new FastReader();
        ArrayList<String> l = new ArrayList<>();
        int x = f.nextInt();
        for (int i = 0; i < x; i++) {
            l.add(f.next());
        }
        System.out.println(l);
    }
}
