import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static long[] dp = new long[101];

    static int t;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        setDp();
        print();
    }

    public static void setDp() {
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i-3] + dp[i-2];
        }
    }

    public static void print() throws IOException {
        for (int i = 0; i < t; i++) {
            sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}