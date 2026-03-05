import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stackInt = new Stack<>();
        
        int n = Integer.parseInt(br.readLine());
        
        // 반복문 안에서 결과가 많을 땐 StringBuilder를 쓰는 게 훨씬 빠릅니다!
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int inputNum = Integer.parseInt(st.nextToken()); // 첫 번째 숫자(명령어)

            switch (inputNum) {
                case 1:
                    int num = Integer.parseInt(st.nextToken()); // 1일 때만 한 번 더 읽기
                    stackInt.push(num);
                    break;
                case 2:
                    if (!stackInt.isEmpty()) {
                        sb.append(stackInt.pop()).append("\n");
                    } else {
                        sb.append("-1\n");
                    }
                    break;
                case 3:
                    sb.append(stackInt.size()).append("\n");
                    break;
                case 4:
                    sb.append(stackInt.isEmpty() ? "1\n" : "0\n");
                    break;
                case 5:
                    if (!stackInt.isEmpty()) {
                        sb.append(stackInt.peek()).append("\n");
                    } else {
                        sb.append("-1\n");
                    }
                    break;
            }
        }
        System.out.println(sb); // 모아둔 결과를 한 번에 출력
    }
}