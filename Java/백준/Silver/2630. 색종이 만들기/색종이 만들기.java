import java.io.*;
import java.util.*;

public class Main {
    static int white = 0;
    static int blue = 0;
    static int[][] board;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        partition(0, 0, n);
        
        System.out.println(white);
        System.out.println(blue);
    }
    
    public static void partition(int r, int c, int size) {
        if (checkColor(r, c, size)) {
            if (board[r][c] == 0) white++;
            else blue++;
            return;
        }
        
        int newSize = size / 2;
        
        partition(r, c, newSize);
        partition(r, c + newSize, newSize);
        partition(r + newSize, c, newSize);
        partition(r + newSize, c + newSize, newSize);
    }
    
    public static boolean checkColor(int r, int c, int size) {
        int color = board[r][c];
        
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (board[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}