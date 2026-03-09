import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            Stack<Character> s = new Stack<>();
            boolean isBroken = false;
            
            for (char c : str.toCharArray()) {
                if (c == '(') s.push(c);
                else {
                    if (s.isEmpty()) {
                        sb.append("NO\n");
                        isBroken = true;
                        break;
                    }
                    s.pop();
                }
            }
            if (!isBroken) {
                if (s.isEmpty()) sb.append("YES\n");
                else sb.append("NO\n");
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}