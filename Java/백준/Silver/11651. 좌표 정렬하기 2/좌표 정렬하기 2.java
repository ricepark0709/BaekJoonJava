import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Location {
        int x;
        int y;
        Location (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Location[] l = new Location[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            l[i] = new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(l, (l1, l2) -> {
            if (l1.y == l2.y) return l1.x - l2.x;
            return l1.y - l2.y;
        });

        for (Location i : l) sb.append(i.x + " ").append(i.y + "\n");

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}