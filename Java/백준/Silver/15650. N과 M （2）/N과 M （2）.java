import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[] result;
    static int n, m;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        result = new int[m];

        dfs(1, 0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void dfs(int start, int depth) {
        if (depth == m) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            result[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}