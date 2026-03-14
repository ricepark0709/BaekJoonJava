import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] adj; // 인접 리스트
    static boolean[] visited;       // 방문 체크
    static int count = 0;           // 감염된 컴퓨터 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int m = Integer.parseInt(br.readLine()); // 연결 쌍의 수

        // 1. 그래프 초기화
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        // 2. 양방향 연결 정보 저장
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        visited = new boolean[n + 1];
        
        // 3. 1번 컴퓨터부터 탐색 시작
        dfs(1);

        // 1번 컴퓨터 자신은 제외해야 하므로 count - 1
        System.out.println(count - 1);
    }

    static void dfs(int node) {
        visited[node] = true; // 현재 노드 방문 처리
        count++;              // 감염자 수 증가

        // 연결된 다음 노드들 확인
        for (int next : adj[node]) {
            if (!visited[next]) { // 방문하지 않은 연결된 컴퓨터라면
                dfs(next);        // 더 깊이 탐색
            }
        }
    }
}