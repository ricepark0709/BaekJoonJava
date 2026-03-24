import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static boolean[] virus;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        setBoolean(n);
        setArr(n);
        hack(m);
        result(1);
        print(n);
    }

    public static void setBoolean(int n) {
        virus = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            virus[i] = false;
        }
        virus[1] = true;
    }

    public static void setArr(int n) {
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
    }

    public static void hack(int m) throws IOException {
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
    }

    public static void result(int a) {
        for (int i : list.get(a)) {
            if (!virus[i]) {
                virus[i] = true;
                result(i);
            }
        }
    }

    public static void print(int n) {
        for (int i = 2; i <= n; i++) {
            if (virus[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}