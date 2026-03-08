import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new ArrayDeque<>();
        
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        
        for (int i = 0; i < n-1; i++) {
            q.poll();
            q.offer(q.poll());
        }
        
        System.out.println(q.peek());
    }
}