import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 필요한 나무 길이

        int[] trees = new int[N];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > max) max = trees[i]; // 가장 높은 나무 찾기
        }

        // 이분 탐색 시작
        long low = 0;
        long high = max;
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long sum = 0;

            for (int tree : trees) {
                if (tree > mid) {
                    sum += (tree - mid);
                }
            }

            if (sum >= M) { // 나무가 충분함 -> 높이를 더 높여보자
                result = mid; 
                low = mid + 1;
            } else { // 나무가 부족함 -> 높이를 낮춰야 함
                high = mid - 1;
            }
        }

        System.out.println(result);
    }
}