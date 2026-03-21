import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static class location {
        int x;
        int y;
        location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        location[] l = new location[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            l[i] = new location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(l, (l1, l2) -> {
            if (l1.x == l2.x) return l1.y - l2.y;
            return l1.x - l2.x;
        });

        for (location i : l) sb.append(i.x + " ").append(i.y + "\n");

        bw.write(sb.toString());

        bw.flush();
        bw.close();


    }
}