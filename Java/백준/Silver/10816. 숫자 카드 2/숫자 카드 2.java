import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 1. 상근이가 가진 카드 입력받기
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        // Key: 카드 숫자, Value: 해당 카드의 개수
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            // 핵심 메소드: getOrDefault(key, 기본값)
            // 카드가 처음 나오면 0+1, 이미 있으면 기존개수+1
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        // 2. 몇 개인지 알아내야 할 카드들 입력받기
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            
            // 이중 for문 대신 map.getOrDefault를 쓰면 즉시 개수가 나옵니다.
            sb.append(map.getOrDefault(target, 0)).append(" ");
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}