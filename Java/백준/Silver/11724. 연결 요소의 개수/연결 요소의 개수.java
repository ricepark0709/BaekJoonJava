import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] arr;
    static boolean[] visited;
    static int n, m;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        process(m);
        result();
    }

    public static void process(int m) throws IOException {
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }
    }

    public static void bfs(int a) {
        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        visited[a] = true;

        while (!q.isEmpty()) {
            int num = q.poll();
            for (int i = 1; i <= n; i++) {
                if (arr[num][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void result() {
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++;
                bfs(i);
            }
        }

        System.out.println(count);
    }
}