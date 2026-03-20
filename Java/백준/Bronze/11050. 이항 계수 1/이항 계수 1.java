import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int N = 1;
        int K = 1;
        for (int i = 0; i < k; i++) {
            int num = n;
            N *= num;
            n--;
        }

        for (int i = 1; i <= k; i++) {
            K *= i;
        }

        System.out.println(N/K);

    }
}