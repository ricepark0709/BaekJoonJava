import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        
        for (int i = 0; i < n-1; i++) {
            q.poll();
            q.offer(q.poll());
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb.append(q.peek());
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}