import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        process(n);
        print();
    }

    static PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    public static void process(int n) throws IOException {
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (q.isEmpty()) sb.append(0 + "\n");
                else sb.append(q.poll() + "\n");
            } else {
                q.add(num);
            }
        }
    }

    public static void print() throws IOException {
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}