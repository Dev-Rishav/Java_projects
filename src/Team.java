import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Team {
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



    static int check(ArrayList<ArrayList<Integer>> list){
        int count=0,ans=0;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<3;j++){
                if(list.get(i).get(j) != 0)
                    count++;
            }
            if(count >= 2)
                ans++;
            count=0;
        }
        return ans;
    }


    public static void main(String[] args) {
        Team t=new Team();
        int x=t.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        while(x>0){
            list.add(new ArrayList<Integer>(Arrays.asList(t.nextInt(),t.nextInt(),t.nextInt())));
            x--;
        }
        System.out.println(check(list));
    }
}