import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<Integer> intList = new ArrayList<>();

    static int sum;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine(), "-");
        while(st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        for (int i = 0; i < list.size(); i++) {
            st = new StringTokenizer(list.get(i), "+");
            sum = 0;
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            intList.add(sum);
        }

        for (int i = 1; i < intList.size(); i++) {
            result += intList.get(i);
        }

        System.out.println(intList.get(0) - result);
    }
}