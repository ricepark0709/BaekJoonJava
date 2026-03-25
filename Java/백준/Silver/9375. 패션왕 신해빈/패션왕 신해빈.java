import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static Map<String, Integer> map = new HashMap<>();
    static Queue<String> q = new ArrayDeque<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static int sum;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            setMap();
            count();
        }

        print();
    }

    public static void setMap() throws IOException {
        int n = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String body = st.nextToken();
            if (!q.contains(body)) q.offer(body);
            if (!map.containsKey(body)) map.put(body, 1);
            else {
                int num = map.get(body);
                num++;
                map.put(body, num);
            }
        }
    }

    public static void count() {
        sum = 1;
        list = new ArrayList<>();
        while (!q.isEmpty()) {
            list.add(map.get(q.poll()));
        }
        for (int i = 0; i < list.toArray().length; i++) {
            sum *= ((int)list.toArray()[i] + 1);
        }
        sum--;
        sb.append(sum + "\n");
    }

    public static void print() throws IOException {
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}