import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        setDp();
        System.out.println(dp[n]);
    }

    static int[] dp;
    public static void setDp() {
        dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= 1000; i++) {
            dp[i] = dp[i-2] % 10007 + dp[i-1] % 10007;
            dp[i] %= 10007;
        }
    }
}