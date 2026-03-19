import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[6];
    static int N, T, P, TBox;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        for (int i : arr) {
            int buy = i/T;
            if (i%T == 0) TBox += buy;
            else TBox += (buy+1);
        }
        sb.append(TBox + " ").append("\n").append(N/P + " ").append(N%P);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}