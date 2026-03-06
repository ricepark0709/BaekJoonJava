import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break; // 종료 조건

            System.out.println(solve(line));
        }
    }

    public static String solve(String line) {
        Stack<Character> s = new Stack<>();

        for (char c : line.toCharArray()) {
            // 1. 열린 괄호는 일단 쌓기
            if (c == '(' || c == '[') {
                s.push(c);
            } 
            // 2. 닫힌 소괄호
            else if (c == ')') {
                if (s.isEmpty() || s.peek() != '(') {
                    return "no";
                }
                s.pop();
            } 
            // 3. 닫힌 대괄호
            else if (c == ']') {
                if (s.isEmpty() || s.peek() != '[') {
                    return "no";
                }
                s.pop();
            }
        }

        // 4. 모든 검사가 끝난 후 스택이 비어있어야 진짜 완벽한 균형!
        if (s.isEmpty()) return "yes";
        else return "no";
    }
}