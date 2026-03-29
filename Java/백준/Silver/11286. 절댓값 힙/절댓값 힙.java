import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static int n;

    static PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
        int a = Math.abs(o1);
        int b = Math.abs(o2);
        
        if (a == b) {
            return o1 - o2;
        }
        
        return a - b;
    });

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        fillQueue();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void fillQueue() throws IOException {
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.add(num);
            }
        }
    }
}