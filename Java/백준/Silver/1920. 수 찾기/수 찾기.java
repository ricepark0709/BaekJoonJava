import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Set<Integer> s = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            s.add(Integer.parseInt(st.nextToken()));
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < m; i++) {
            if (s.contains(Integer.parseInt(st.nextToken()))) sb.append("1\n");
            else sb.append("0\n");
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}