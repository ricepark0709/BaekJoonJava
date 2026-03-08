import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        
        sb.append("<");
        while(!q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}