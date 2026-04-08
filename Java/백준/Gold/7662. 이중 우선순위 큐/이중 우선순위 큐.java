import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int t, k;
    static TreeMap<Integer, Integer> map;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            setMap();
        }
        write();
    }

    public static void setMap() throws IOException {
        k = Integer.parseInt(br.readLine());
        map = new TreeMap<>();

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0); int num = Integer.parseInt(st.nextToken());

            switch (c) {
                case 'I':
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    break;
                case 'D':
                    if (map.isEmpty()) continue;

                    int key = (num == 1) ? map.lastKey() : map.firstKey();
                    int count = map.get(key);

                    if (count == 1) map.remove(key);
                    else map.put(key, count - 1);
                    break;
            }
        }
        if (map.isEmpty()) sb.append("EMPTY\n");
        else sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
    }

    public static void write() throws IOException {
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}