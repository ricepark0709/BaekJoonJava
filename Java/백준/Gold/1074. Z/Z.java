import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, r, c, result = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        solve((int)Math.pow(2, n), r, c);
        System.out.println(result);
    }

    public static void solve(int size, int r, int c) {
        if (size == 1) return;

        int half = size / 2;

        if (c < half && r < half) {
            solve(half, r, c);
        } else if (c >= half && r < half) {
            result += half * half;
            solve(half, r, c - half);
        } else if (c < half && r >= half) {
            result += half * half * 2;
            solve(half, r - half, c);
        } else {
            result += half * half * 3;
            solve(half, r - half, c - half);
        }
    }
}