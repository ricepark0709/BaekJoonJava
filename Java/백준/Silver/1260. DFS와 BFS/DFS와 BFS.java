import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static boolean[] visited;
    static List<List<Integer>> adj;
    static Queue<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        visited = new boolean[n+1];
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        
        for (int i = 1; i <= n; i++) {
            Collections.sort(adj.get(i));
        }

        dfs(v);
        reset(n);
        sb.append("\n");
        bfs(v);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }

    public static void dfs(int curr) {
        visited[curr] = true;
        sb.append(curr).append(" ");

        for (int next : adj.get(curr)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void reset(int n) {
        for (int i = 0; i <= n; i++) {
            visited[i] = false;
        }
    }

    public static void bfs(int start) {
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            sb.append(curr).append(" ");

            for (int next : adj.get(curr)) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
    }
}