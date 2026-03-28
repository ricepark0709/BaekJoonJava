import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] dp = new int[50001];

    public static void main(String[] args) throws IOException {
        setDp();
        System.out.println(dp[Integer.parseInt(br.readLine())]);
    }

    public static void setDp() {
        dp[1] = 1;
        for (int i = 2; i <= 50000; i++) {
            int min = 4;
            for (int j = 1; j * j <= i; j++) {
                int temp = dp[i - j * j] + 1;
                min = Math.min(temp, min);
            }
            dp[i] = min;
        }
    }
}