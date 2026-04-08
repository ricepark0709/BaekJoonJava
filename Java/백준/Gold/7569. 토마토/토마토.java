import java.io.*;
import java.util.*;

public class Main {
    public static class Point {
        int z, y, x;
        Point(int z, int y, int x) {
            this.z = z;
            this.y = y;
            this.x = x;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static int[][][] arr;
    static Queue<Point> q;
    static int m, n, h, max = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        setArr();
        bfs();
        check();

        System.out.println(max - 1);
    }

    public static void setArr() throws IOException {
        arr = new int[h][n][m];
        q = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (arr[i][j][k] == 1) {
                        q.add(new Point(i, j, k));
                    }
                }
            }
        }
    }

    public static void bfs() {
        while (!q.isEmpty()) {
            Point p = q.poll();

            for (int i = 0; i < 6; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                int nz = p.z + dz[i];

                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < m && ny < n && nz < h) {
                    if (arr[nz][ny][nx] == 0) {
                        arr[nz][ny][nx] = arr[p.z][p.y][p.x] + 1;
                        q.add(new Point(nz, ny, nx));
                    }
                }
            }
        }
    }

    public static void check() {
        max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[i][j][k] == 0) {
                        max = 0;
                        return;
                    }
                    max = Math.max(max, arr[i][j][k]);
                }
            }
        }
    }
}