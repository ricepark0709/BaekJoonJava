import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static char[][] picture;
    static char[][] blindPicture;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static int n, noBlind = 0, blind = 0;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        visited = new boolean[n][n];
        setPicture();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    noBlind++;
                    dfs(i, j);
                }
            }
        }

        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    blind++;
                    dfs2(i, j);
                }
            }
        }

        System.out.println(noBlind + " " + blind);
    }

    public static void setPicture() throws IOException {
        picture = new char[n][n];
        blindPicture = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                picture[i][j] = str.charAt(j);
                if (picture[i][j] == 'G') {
                    blindPicture[i][j] = 'R';
                } else blindPicture[i][j] = str.charAt(j);
            }
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        char color = picture[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny] && picture[nx][ny] == color) {
                dfs(nx, ny);
                visited[nx][ny] = true;
            }
        }
    }

    public static void dfs2(int x, int y) {
        visited[x][y] = true;
        char color = blindPicture[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny] && blindPicture[nx][ny] == color) {
                dfs2(nx, ny);
                visited[nx][ny] = true;
            }
        }
    }
}