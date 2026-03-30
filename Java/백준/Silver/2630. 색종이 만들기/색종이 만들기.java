import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, white, blue;

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        setArr();
        recursion(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    public static void setArr() throws IOException {
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void recursion(int x, int y, int size) {
        if (check(x, y, size)) {
            if (arr[x][y] == 0) white++;
            else blue++;
            return;
        }

        int newSize = size / 2;

        recursion(x + newSize, y, newSize);
        recursion(x, y + newSize, newSize);
        recursion(x + newSize, y + newSize, newSize);
        recursion(x, y, newSize);
    }

    public static boolean check(int x, int y, int size) {
        int color = arr[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}