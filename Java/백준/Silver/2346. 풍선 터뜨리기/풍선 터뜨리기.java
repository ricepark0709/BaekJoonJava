import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 풍선의 번호를 담을 덱
        Deque<Integer> q = new ArrayDeque<>();
        // 풍선 안의 숫자를 담을 배열
        int[] arr = new int[n + 1]; 
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            q.add(i);
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!q.isEmpty()) {
            // 1. 현재 맨 앞의 풍선을 터뜨림
            int current = q.pollFirst();
            sb.append(current).append(" ");
            
            // 마지막 풍선이었다면 이동할 필요 없음
            if (q.isEmpty()) break;
            
            int move = arr[current];
            
            if (move > 0) {
                // 양수일 때: 이미 하나 뽑았으므로 (move - 1)번 뒤로 보냄
                for (int j = 0; j < move - 1; j++) {
                    q.addLast(q.pollFirst());
                }
            } else {
                // 음수일 때: 절댓값만큼 뒤에서 앞으로 가져옴
                for (int j = 0; j < Math.abs(move); j++) {
                    q.addFirst(q.pollLast());
                }
            }
        }
        
        System.out.println(sb.toString().trim());
    }
}