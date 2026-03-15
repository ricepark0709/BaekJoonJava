import java.util.*;
import java.io.*;

public class Main {
    static int N, K;
    static int[] visited = new int[100001]; // 방문 여부와 시간을 동시에 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
            return;
        }

        bfs(N);
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = 1; // 시작 위치 방문 표시

        while (!q.isEmpty()) {
            int current = q.poll();

            // 3가지 이동 경로 확인
            int[] nextPositions = {current - 1, current + 1, current * 2};

            for (int next : nextPositions) {
                if (next == K) { // 동생을 찾았다면!
                    System.out.println(visited[current]); // 현재까지 걸린 시간 출력
                    return;
                }

                // 범위 내에 있고 아직 방문하지 않았다면
                if (next >= 0 && next <= 100000 && visited[next] == 0) {
                    q.add(next);
                    visited[next] = visited[current] + 1;
                }
            }
        }
    }
}