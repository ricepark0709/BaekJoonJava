import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        Set<Integer> s = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            s.add(Integer.parseInt(st.nextToken()));
        }
        
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            if (s.contains(Integer.parseInt(st.nextToken()))) {
                count++;
            }
        }
        
        sb.append((a + b) - 2 * count);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}