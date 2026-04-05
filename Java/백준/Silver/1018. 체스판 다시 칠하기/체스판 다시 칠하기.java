import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static boolean[][] chess;

    static int n, m, count, min = 64;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        setChess();
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                check(i, j);
            }
        }
        System.out.println(min);
    }

    public static void setChess() throws IOException {
        chess = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') chess[i][j] = true;
                else chess[i][j] = false;
            }
        }
    }

    public static void check(int x, int y) {
        boolean b = chess[x][y];

        count = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (chess[i][j] != b) {
                    count++;
                }
                b = !b;
            }
            b = !b;
        }

        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}