import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    
    static int[][] graph;
    static boolean[] visited;
    
    static int n, m, v;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        setGraph();
        
        visited = new boolean[n + 1];
        dfs(v);
        sb.append("\n");
        visited = new boolean[n + 1];
        bfs(v);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
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
    
    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");
        
        for (int i = 1; i <= n; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
    
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        sb.append(start).append(" ");
        
        while (!q.isEmpty()) {
            int num = q.poll();
            for (int i = 1; i <= n; i++) {
                if (graph[num][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }
}