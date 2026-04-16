import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] time = new int[100001];
    static int n, k;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new LinkedList<>();
        Arrays.fill(time, -1);
        dq.add(n);
        time[n] = 0;


        while (!dq.isEmpty()) {
            int cur = dq.poll();

            if (cur == k) {
                System.out.println(time[cur]);
                return;
            }

            if (cur * 2 < 100001 && time[cur * 2] == -1) {
                time[cur * 2] = time[cur];
                dq.addFirst(cur * 2);
            }

            int[] next = {cur - 1, cur + 1};
            for (int val : next) {
                if (val >= 0 && val < 100001 && time[val] == -1) {
                    time[val] = time[cur] + 1;
                    dq.addLast(val);
                }
            }
        }
    }
}