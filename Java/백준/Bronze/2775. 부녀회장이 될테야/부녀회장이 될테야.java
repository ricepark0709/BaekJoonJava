import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int[][] arr = new int[15][15];
    static int sum;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i <= 14; i++) arr[0][i] = i;

        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                int k = 1;
                sum = 0;
                while (k <= j) {
                    sum += arr[i-1][k];
                    k++;
                }
                arr[i][j] = sum;
            }
        }

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n] + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}