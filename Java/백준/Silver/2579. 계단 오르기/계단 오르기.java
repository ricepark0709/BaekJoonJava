import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        setStair(n);
        dp(n);
    }

    static int[] stair;
    public static void setStair(int n) throws IOException {
        stair = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void dp(int n) {
        int[] dp = new int[n + 1];
        dp[1] = stair[1];
        if (n > 1) {
            dp[2] = stair[1] + stair[2];
            if (n > 2) {
                for (int i = 3; i <= n; i++) {
                    dp[i] = Math.max(dp[i - 2] + stair[i], dp[i - 3] + stair[i - 1] + stair[i]);
                }
            }
        }
        System.out.println(dp[n]);
    }
}