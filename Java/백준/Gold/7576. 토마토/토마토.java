import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, m, max = 0;
    static int[][] arr;
    static Queue<int[]> q;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        setArr();
        bfs();
        check();

        System.out.println(max - 1);

    }

    public static void setArr() throws IOException {
        arr = new int[m][n];
        q =  new LinkedList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    q.add(new int[]{i, j});
                }
            }
        }
    }

    public static void bfs() {
        while (!q.isEmpty()) {
            int[] curr = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + curr[0];
                int ny = dy[i] + curr[1];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if (arr[nx][ny] == 0) {
                        arr[nx][ny] = arr[curr[0]][curr[1]] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    public static void check() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    max = 0;
                    return;
                }
                max = Math.max(max, arr[i][j]);
            }
        }
    }
}