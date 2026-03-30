import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[] arr;
    static int[] sorted;
    static Map<Integer, Integer> map = new HashMap<>();

    static int n, rank = 0;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        setArr();
        process();
    }

    public static void setArr() throws IOException {
        arr = new int[n];
        sorted = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], rank);
                rank++;
            }
        }
    }

    public static void process() throws IOException {
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}