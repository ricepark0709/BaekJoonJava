import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> s = new Stack<>();
            String str = br.readLine();
            boolean isError = false; // 중간에 잘못된 경우를 체크

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') {
                    s.push(c);
                } else { // ')' 인 경우
                    if (s.isEmpty()) {
                        isError = true;
                        break; // for 루프를 완전히 빠져나감
                    }
                    s.pop();
                }
            }

            // 1. 중간에 에러가 났거나(isError) 
            // 2. 다 끝났는데 스택에 '('가 남아있으면 NO
            if (isError || !s.isEmpty()) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }

        System.out.print(sb);
    }
}