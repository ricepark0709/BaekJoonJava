import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int zero = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if (!(a==0)) q.add(a);
            else if (a==0 && !q.isEmpty()) sb.append(q.poll() + "\n");
            else if (a==0 && q.isEmpty()) sb.append(0 + "\n");
        }

        for (int i = 0; i < zero; i++) {
            if (!q.isEmpty()) sb.append(q.poll() + "\n");
            else sb.append(0 + "\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}