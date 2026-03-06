import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stackInt = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String toDo = st.nextToken();
            if (toDo.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stackInt.push(num);
            } else if (toDo.equals("pop")) {
                if (stackInt.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stackInt.pop());
                }
            } else if (toDo.equals("size")) {
                System.out.println(stackInt.size());
            } else if (toDo.equals("empty")) {
                if (stackInt.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (toDo.equals("top")) {
                if (stackInt.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stackInt.peek());
                }
            }
        }
    }
}