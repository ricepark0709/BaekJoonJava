import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int m, n, max;
    static int[][] arr;
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        setArr();
        bfs();
        findMax();

        System.out.println(max);
    }

    public static void setArr() throws IOException {
        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    visited[i][j] = true;
                    q.add(new int[]{i, j});
                }
                if (arr[i][j] == -1) {
                    visited[i][j] = true;
                }
            }
        }
    }

    public static void bfs() {
        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int[] dx = {-1, 1, 0, 0};
                int[] dy = {0, 0, 1, -1};

                int nx = dx[i] + cur[0];
                int ny = dy[i] + cur[1];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                    arr[nx][ny] = arr[cur[0]][cur[1]] + 1;
                }
            }
        }
    }

    public static void findMax() {
        max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] == 0) {
                    max = -1;
                    return;
                }
            }
        }
        max--;
    }
}