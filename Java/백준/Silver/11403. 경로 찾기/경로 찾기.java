import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[][] arr;
    static boolean[][] visited;

    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        setArr();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    bfs(i, j);
                }
            }
        }

        write();
    }

    public static void setArr() throws IOException {
        arr = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void bfs(int a, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int i = 0; i < n; i++) {
                if (arr[curr][i] == 1 && !visited[a][i]) {
                    arr[a][i] = 1;
                    visited[a][i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void write() throws IOException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}