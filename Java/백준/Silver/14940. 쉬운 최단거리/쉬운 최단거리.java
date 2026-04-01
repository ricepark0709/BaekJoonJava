import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int map[][];
    static boolean visited[][];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n, m, startX, startY;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        setMap();

        bfs(startX, startY);
        write();
    }

    public static void setMap() throws IOException {
        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    visited[i][j] = true;
                }
                if (num == 2) {
                    map[i][j] = 0;
                    startX = i;
                    startY = j;
                }
                if (num == 1) {
                    map[i][j] = -1;
                }
            }
        }
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int num[] = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = num[0] + dx[i];
                int ny = num[1] + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
                    map[nx][ny] = map[num[0]][num[1]] + 1;
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }

    public static void write() throws IOException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}