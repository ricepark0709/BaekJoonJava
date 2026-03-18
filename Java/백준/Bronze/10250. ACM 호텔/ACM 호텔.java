import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int a, h, m, n;

    public static void main(String[] args) throws IOException {
        a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            int room = n/h;
            int floor = n%h;
            if (floor == 0) {
                floor = h;
                room--;
            }

            if (room < 9) sb.append(floor).append(0).append(room+1).append("\n");
            else sb.append(floor).append(room+1).append("\n");
        }

        System.out.println(sb);
    }
}