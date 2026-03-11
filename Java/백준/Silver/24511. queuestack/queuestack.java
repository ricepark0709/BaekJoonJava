import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        int[] type = new int[n]; // 0: 큐, 1: 스택
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            type[i] = Integer.parseInt(st.nextToken());
        }

        // 핵심: 큐(0)인 요소의 초기값만 모은다.
        // 나중에 들어온 놈이 먼저 밀려나가는 구조이므로 Deque를 사용
        Deque<Integer> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (type[i] == 0) {
                // 큐라면 값을 덱에 추가 (앞으로 넣어서 순서를 맞춤)
                deque.addLast(val);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < m; i++) {
            int newVal = Integer.parseInt(st.nextToken());
            
            // 1. 새로운 값을 덱의 맨 앞에 넣는다.
            deque.addFirst(newVal);
            
            // 2. 덱의 맨 뒤에서 빠지는 값이 이번 단계의 출력값이 된다.
            // (마치 거대한 하나의 큐처럼 작동)
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb.toString());
    }
}