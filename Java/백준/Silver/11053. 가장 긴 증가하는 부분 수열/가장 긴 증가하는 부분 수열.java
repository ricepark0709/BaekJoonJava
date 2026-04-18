import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] arr, dp;
    static int n, max = 0;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        setArr();
        setDp();
        System.out.println(max);
    }

    public static void setArr() throws IOException {
        arr = new int[n];
        dp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }
    }

    public static void setDp() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])  dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }
    }
}