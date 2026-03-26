import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] dp = new int[1001];

    public static void main(String[] args) throws IOException {
        setDp();
        System.out.println(dp[Integer.parseInt(br.readLine())]);
    }

    public static void setDp() {
        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;
        for (int i = 4; i <= 1000; i++) {
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }
    }
}