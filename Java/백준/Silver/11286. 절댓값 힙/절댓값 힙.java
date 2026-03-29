import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static int n;

    static PriorityQueue<Long> plusQ = new PriorityQueue<>();
    static PriorityQueue<Long> minusQ = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        fillQueue();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void fillQueue() throws IOException {
        for (int i = 0; i < n; i++) {
            long num = Integer.parseInt(br.readLine());
            if (num > 0) {
                plusQ.add(num);
            } else if (num < 0) {
                minusQ.add(num);
            } else {
                if (plusQ.isEmpty() && !minusQ.isEmpty()) {
                    sb.append(minusQ.poll()).append("\n");
                } else if (!plusQ.isEmpty() && minusQ.isEmpty()) {
                    sb.append(plusQ.poll()).append("\n");
                } else if (plusQ.isEmpty() && minusQ.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    long temp1 = Math.abs(plusQ.peek());
                    long temp2 = Math.abs(minusQ.peek());
                    if (temp1 >= temp2) {
                        sb.append(minusQ.poll()).append("\n");
                    } else {
                        sb.append(plusQ.poll()).append("\n");
                    }
                }
            }
        }
    }
}