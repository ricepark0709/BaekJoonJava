import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // 1. 1부터 N까지 숫자가 담긴 연결 리스트 생성 (기차 칸 만들기)
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        
        // 2. 뽑아야 할 숫자들을 순서대로 입력받음
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int move = 0;
        
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st2.nextToken()); // 이번에 뽑을 숫자
            
            // 3. 현재 리스트에서 타겟 숫자가 몇 번째(인덱스)에 있는지 확인
            int targetIdx = list.indexOf(target);
            int halfIdx = list.size() / 2;
            
            // 4. 타겟이 맨 앞(0번 인덱스)에 올 때까지 회전
            while (list.peekFirst() != target) {
                // 인덱스가 중간보다 뒤에 있으면 -> 오른쪽으로 돌리는 게 빠름 (3번 연산)
                if (targetIdx > halfIdx) {
                    list.addFirst(list.pollLast());
                } 
                // 인덱스가 중간보다 앞에 있거나 같으면 -> 왼쪽으로 돌리는 게 빠름 (2번 연산)
                else {
                    list.addLast(list.pollFirst());
                }
                move++;
            }
            
            // 5. 타겟이 맨 앞에 도착했으므로 뽑아서 제거 (1번 연산)
            list.pollFirst();
        }
        
        // 결과 출력
        System.out.println(move);
    }
}