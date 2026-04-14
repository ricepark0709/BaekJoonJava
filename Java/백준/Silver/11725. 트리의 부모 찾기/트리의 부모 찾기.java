import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); static StringTokenizer st; static StringBuilder sb = new StringBuilder();
    static int n;
    static ArrayList<Integer>[] adj;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        parent = new int[n + 1];
        visited = new boolean[n + 1];

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        bfs(1);

        for (int i = 2; i <= n; i++) {
            sb.append(parent[i]).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[1] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int val : adj[cur]) {
                if (!visited[val]) {
                    q.add(val);
                    visited[val] = true;
                    parent[val] = cur;
                }
            }
        }
    }
}