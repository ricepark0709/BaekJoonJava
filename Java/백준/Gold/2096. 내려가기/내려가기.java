import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;
    static int[] maxDp;
    static int[] minDp;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        maxDp = new int[3];
        minDp = new int[3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int x3 = Integer.parseInt(st.nextToken());

            if (i == 0) {
                maxDp[0] = minDp[0] = x1;
                maxDp[1] = minDp[1] = x2;
                maxDp[2] = minDp[2] = x3;
            } else {
                int prevMax1 = maxDp[0], prevMax2 = maxDp[1], prevMax3 = maxDp[2];
                maxDp[0] = Math.max(prevMax1, prevMax2) + x1;
                maxDp[1] = Math.max(prevMax1, Math.max(prevMax2, prevMax3)) + x2;
                maxDp[2] = Math.max(prevMax2, prevMax3) + x3;

                int prevMin1 = minDp[0], prevMin2 = minDp[1], prevMin3 = minDp[2];
                minDp[0] = Math.min(prevMin1, prevMin2) + x1;
                minDp[1] = Math.min(prevMin1, Math.min(prevMin2, prevMin3)) + x2;
                minDp[2] = Math.min(prevMin2, prevMin3) + x3;
            }
        }
        int totalMax = Math.max(maxDp[0], Math.max(maxDp[1], maxDp[2]));
        int totalMin = Math.min(minDp[0], Math.min(minDp[1], minDp[2]));

        System.out.println(totalMax + " " + totalMin);
    }
}