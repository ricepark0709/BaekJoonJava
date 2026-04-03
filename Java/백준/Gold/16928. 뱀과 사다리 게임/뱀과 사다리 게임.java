import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] map = new int[101];
    static boolean[] visited = new boolean[101];
    static Map<Integer, Integer> h = new HashMap<>();

    static int n, m;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        setMap();
        bfs(1);

        System.out.println(map[100]);

    }

    public static void setMap() throws IOException {
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            h.put(a, b);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            h.put(a, b);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.poll();

            int[] move = {curr + 1, curr + 2, curr + 3, curr + 4, curr + 5, curr + 6};
            for (int i : move) {
                if (h.containsKey(i)) i = h.get(i);
                if (i <= 100 && !visited[i]) {
                    visited[i] = true;
                    map[i] = map[curr] + 1;
                    q.add(i);
                }
            }
        }
    }
}