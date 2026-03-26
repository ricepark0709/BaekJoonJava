import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static Queue<Integer> q = new ArrayDeque<>();
    static Stack<Integer> s = new Stack<>();

    static int n;
    static int num = 1;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        fillQueue();
        push();

        if (pop()) {
            bw.write(sb.toString());

            bw.flush();
            bw.close();
        } else System.out.println("NO");
    }

    public static void fillQueue() throws IOException {
        for (int i = 0; i < n; i++) {
            q.add(Integer.parseInt(br.readLine()));
        }
    }

    public static void push() {
        while (num <= n) {
            s.push(num);
            sb.append("+\n");
            num++;
            if (!s.isEmpty() && s.peek().equals(q.peek())) {
                while (!s.isEmpty() && s.peek().equals(q.peek())) {
                    s.pop();
                    q.poll();
                    sb.append("-\n");
                }
            }
        }
    }

    public static boolean pop() {
        while (!s.isEmpty()) {
            if (s.peek().equals(q.peek())) {
                q.poll();
                s.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}