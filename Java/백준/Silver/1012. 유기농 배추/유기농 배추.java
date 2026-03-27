import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[][] farm;
    static boolean[][] visited;

    static int t, n, m, k, x, y, count;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            count = 0;
            setFarm();
            setVisited();
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    if (farm[x][y] == 1 && !visited[x][y]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void setFarm() throws IOException {
        farm = new int[n][m];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            farm[x][y] = 1;
        }
    }

    public static void setVisited() {
        visited = new boolean[n][m];
    }

    public static void dfs(int a, int b) {
        visited[a][b] = true;

        if (a != 0) {
            if (farm[a - 1][b] == 1 && !visited[a - 1][b])  {
                dfs(a - 1, b);
            }
        }
        if (a != n - 1) {
            if (farm[a + 1][b] == 1 && !visited[a + 1][b])  {
                dfs(a + 1, b);
            }
        }
        if (b != 0) {
            if (farm[a][b - 1] == 1 && !visited[a][b - 1])  {
                dfs(a, b - 1);
            }
        }
        if (b != m - 1) {
            if (farm[a][b + 1] == 1 && !visited[a][b + 1])  {
                dfs(a, b + 1);
            }
        }
    }
}