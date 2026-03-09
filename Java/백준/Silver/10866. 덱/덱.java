import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> d = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push_front":
                    int o = Integer.parseInt(st.nextToken());
                    d.offerFirst(o);
                    break;
                case "push_back":
                    int b = Integer.parseInt(st.nextToken());
                    d.offerLast(b);
                    break;
                case "pop_front":
                    sb.append((d.isEmpty()) ? -1 : d.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append((d.isEmpty()) ? -1 : d.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(d.size()).append("\n");
                    break;
                case "empty":
                    sb.append((d.isEmpty()) ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append((d.isEmpty()) ? -1 : d.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append((d.isEmpty()) ? -1 : d.peekLast()).append("\n");
                    break;
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}