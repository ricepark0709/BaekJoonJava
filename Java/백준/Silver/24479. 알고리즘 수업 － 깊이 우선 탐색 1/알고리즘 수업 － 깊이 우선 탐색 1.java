import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> arr;
    static int[] order; // 각 정점의 방문 순서를 저장할 배열
    static int count = 1; // 순서 카운트
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        arr = new ArrayList<>();
        visited = new boolean[n+1];
        order = new int[n+1]; // 방문 순서 기록용
        
        for (int i = 0; i <= n; i++) arr.add(new ArrayList<>());
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        
        // [중요] 각 정점의 인접 리스트를 오름차순 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(arr.get(i));
        }
        
        dfs(r);
        
        // 결과 출력: 1번 정점부터 n번 정점까지의 방문 순서 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(order[i]).append("\n");
        }
        System.out.print(sb);
    }
    
    public static void dfs(int node) {
        visited[node] = true;
        order[node] = count++; // 현재 노드에 방문 순서(1, 2, 3...) 기록
        
        for (int next : arr.get(node)) {
            if (!visited[next]) { // 다음 노드(next)를 방문하지 않았다면
                dfs(next);        // 다음 노드로 이동
            }
        }
    }
}