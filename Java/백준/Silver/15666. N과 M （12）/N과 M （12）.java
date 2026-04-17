import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int n, m;
    static int[] arr, result;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        setArr();
        dfs(0, 0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void setArr() throws IOException {
        arr = new int[n];
        result = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
    }

    public static void dfs(int start, int depth) {
        if (depth == m) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append('\n');
            return;
        }

        int last = 0;
        for (int i = start; i < n; i++) {
            if (last != arr[i]) {
                result[depth] = arr[i];
                last = arr[i];
                dfs(i, depth + 1);
            }
        }
    }
}