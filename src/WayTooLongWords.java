import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;




public class WayTooLongWords {

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


    static void shrink(ArrayList<String> list, int n) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (list.get(i).length() > 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(list.get(i).charAt(0));
                sb.append(list.get(i).length() - 2);
                sb.append(list.get(i).charAt(list.get(i).length() - 1));
                res.add(sb.toString());
            } else {
                res.add(list.get(i));
            }
        }
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        WayTooLongWords f=new WayTooLongWords();
        int l = f.nextInt();
        for (int i = 0; i < l; i++) {
            list.add(f.next());
        }

        shrink(list, list.size());
    }
}
