import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];    // 원본 배열
        int[] sorted = new int[N];    // 정렬할 배열
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        // 2. 중복 제거하며 순위(index) 매기기
        int rank = 0;
        for(int v : sorted) {
            if(!rankMap.containsKey(v)) {
                rankMap.put(v, rank);
                rank++;
            }
        }

        // 3. 출력 최적화를 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            int ranking = rankMap.get(key); // HashMap 탐색은 O(1)
            sb.append(ranking).append(' ');
        }
        
        System.out.println(sb);
    }
}