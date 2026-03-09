import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        int num = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push":
                    int o = Integer.parseInt(st.nextToken());
                    num = o;
                    q.offer(o);
                    break;
                case "pop":
                    sb.append((q.isEmpty()) ? -1 : q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append((q.isEmpty()) ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append((q.isEmpty()) ? -1 : q.peek()).append("\n");
                    break;
                case "back":
                    sb.append((q.isEmpty()) ? -1 : num).append("\n");
                    break;
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}