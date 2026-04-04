import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] graph;
    static int[] dist;

    static int n, m, min = Integer.MAX_VALUE, result;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        setGraph();
        
        for (int i = 1; i <= n; i++) {
            int val = bfs(i);
            if (val < min) {
                min = val;
                result = i;
            }
        }

        System.out.println(result);
    }

    public static void setGraph() throws IOException {
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
    }

    public static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist = new int[n + 1];
        Arrays.fill(dist, -1);
        dist[start] = 0;

        int sum = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int i = 1; i <= n; i++) {
                if (graph[curr][i] == 1 && dist[i] == -1) {
                    dist[i] = dist[curr] + 1;
                    q.add(i);
                    sum += dist[i];
                }
            }
        }
        return sum;
    }
}