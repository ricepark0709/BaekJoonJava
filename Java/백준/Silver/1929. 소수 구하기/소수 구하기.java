import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] arr = new boolean[1000001];
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Arrays.fill(arr, true);
        
        arr[0] = arr[1] = false;

        for (int i = 2; i * i <= m; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= m; j += i) {
                    arr[j] = false;
                }
            }
        }

        for (int i = n; i <= m; i++) if (arr[i]) sb.append(i + "\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}