import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
        int abs1 = Math.abs(o1);
        int abs2 = Math.abs(o2);
        
        if (abs1 == abs2) {
            return o1 - o2;
        }
        return abs1 - abs2;
    });
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            process(Integer.parseInt(br.readLine()));
        }
        printing();
    }
    
    public static void process(int n) {
        if (n != 0) q.offer(n);
        else if (n == 0) {
            if (q.isEmpty()) sb.append(0 + "\n");
            else sb.append(q.poll() + "\n");
        }
    }
    
    public static void printing() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}