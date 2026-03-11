import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int expected = 1;

        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());

            if (current == expected) expected++;
            else stack.push(current);

            while (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (stack.isEmpty()) sb.append("Nice");
        else sb.append("Sad");
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}