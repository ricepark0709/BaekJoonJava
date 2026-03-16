import java.io.*;
import java.util.*;

public class Main {
    static int[][] map, result;
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우 이동용
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        result = new int[n][m];
        int startX = -1, startY = -1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                
                if (map[i][j] == 2) { // 시작 지점(목표)
                    startX = i;
                    startY = j;
                    result[i][j] = 0;
                } else if (map[i][j] == 1) { // 갈 수 있는 땅은 일단 -1로 초기화
                    result[i][j] = -1;
                } else { // 벽(0)은 0 그대로 유지
                    result[i][j] = 0;
                }
            }
        }

        bfs(startX, startY, n, m);

        // 출력 최적화
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void bfs(int sx, int sy, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sx, sy});

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 체크 및 방문하지 않은 갈 수 있는 땅(result가 -1인 곳)인지 확인
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (result[nx][ny] == -1 && map[nx][ny] == 1) {
                        result[nx][ny] = result[x][y] + 1; // 이전 거리 + 1
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}