import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 클래스 명은 반드시 Main!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // n 입력 시 공백이 섞일 수 있으므로 trim() 사용
        String inputN = br.readLine();
        if (inputN == null) return;
        int n = Integer.parseInt(inputN.trim());
        
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line == null) break;

            Stack<Character> s = new Stack<>();
            boolean isGood = true; 

            for (char c : line.toCharArray()) {
                if (c == '(') {
                    s.push(c);
                } else {
                    // ')' 가 나왔는데 스택이 비어있으면 실패!
                    if (s.isEmpty()) {
                        isGood = false;
                        break; 
                    }
                    s.pop();
                }
            }

            // 다 끝났는데 스택에 '(' 가 남아있어도 안됨!
            if (isGood && s.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}