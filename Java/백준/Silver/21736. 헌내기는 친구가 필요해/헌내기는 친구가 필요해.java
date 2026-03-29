import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static char[][] school;
    static boolean[][] visited;

    static int n, m, a, b, count = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        setSchool();
        visited = new boolean[n][m];

        dfs(a, b);
        
        if (count > 0) System.out.println(count);
        else System.out.println("TT");
    }

    public static void setSchool() throws IOException {
        school = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                school[i][j] = str.charAt(j);
                if (school[i][j] == 'I') {
                    a = i;
                    b = j;
                }
            }
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        if (school[x][y] == 'P') count++;

        if (x != 0 && !visited[x - 1][y] && school[x - 1][y] != 'X') {
            dfs(x - 1, y);
        }
        if (x != n - 1 && !visited[x + 1][y] && school[x + 1][y] != 'X') {
            dfs(x + 1, y);
        }
        if (y != 0 && !visited[x][y - 1] && school[x][y - 1] != 'X') {
            dfs(x, y - 1);
        }
        if (y != m - 1 && !visited[x][y + 1] && school[x][y + 1] != 'X') {
            dfs(x, y + 1);
        }
    }
}