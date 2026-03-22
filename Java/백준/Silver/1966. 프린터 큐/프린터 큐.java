import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Print {
        int id;
        int priority;
        public Print(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Queue<Print> q = new ArrayDeque<>();
            PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int printCount = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                max.add(num);
                q.add(new Print(j, num));
            }

            while (!q.isEmpty()) {
                int high = max.peek();
                if (q.peek().priority == high) {
                    printCount++;
                    if (q.peek().id == m) {
                        sb.append(printCount + "\n");
                        break;
                    }
                    q.poll();
                    max.poll();
                } else q.offer(q.poll());
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}