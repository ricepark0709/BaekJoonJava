import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static int n, count = 0, apartment = 0;

    static int[][] map;
    static boolean[][] visited;

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        setMap();

        visited = new boolean[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    list.add(count);
                    apartment++;
                }
            }
        }

        list.toArray();
        Collections.sort(list);

        sb.append(apartment).append("\n");

        for (int i : list) {
            sb.append(i).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void setMap() throws IOException {
        map = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j + 1] = str.charAt(j) - '0';
            }
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        count++;

        if (x != 0 && !visited[x - 1][y] && map[x - 1][y] == 1) {
            dfs(x - 1, y);
        }
        if (x != n && !visited[x + 1][y] && map[x + 1][y] == 1) {
            dfs(x + 1, y);
        }
        if (y != 0 && !visited[x][y - 1] && map[x][y - 1] == 1) {
            dfs(x, y - 1);
        }
        if (y != n && !visited[x][y + 1] && map[x][y + 1] == 1) {
            dfs(x, y + 1);
        }
    }
}