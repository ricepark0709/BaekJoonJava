import java.util.*;
import java.io.*;

public class Main {
    public static boolean[][] board; // W를 true, B를 false로 저장할 배열
    public static int min = 64;    // 8x8에서 나올 수 있는 최대 칠하기 횟수는 64

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        // 1. 보드 입력 받기
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }

        // 2. 8x8로 자를 수 있는 모든 시작점(i, j) 탐색
        // N-7, M-7 전까지만 돌아야 8x8 판이 나옵니다.
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                findMin(i, j);
            }
        }
        System.out.println(min);
    }

    // 3. (x, y)를 왼쪽 위 꼭짓점으로 하는 8x8 판을 검사하는 메서드
    public static void findMin(int x, int y) {
        int count = 0;
        boolean color = board[x][y]; // 첫 번째 칸의 색 (기준)

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // 현재 칸의 색이 기대하는 색과 다르면 count 증가
                if (board[i][j] != color) {
                    count++;
                }
                // 다음 칸은 색이 바뀌어야 함
                color = !color;
            }
            // 줄이 바뀌면 시작 색이 이전 줄의 시작 색과 달라야 함
            color = !color;
        }

        // '첫 번째 칸을 기준으로 계산한 값'과 '그 반대 색으로 시작했을 때 값(64 - count)' 중 최소값 선택
        count = Math.min(count, 64 - count);
        
        // 전체 경우 중 최솟값 갱신
        min = Math.min(min, count);
    }
}