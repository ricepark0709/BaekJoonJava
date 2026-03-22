import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> s = new Stack<>();
            String str = br.readLine();
            boolean b = true;

            for (int j = 0; j < str.length(); j++) {
                switch (str.charAt(j)) {
                    case '(':
                        s.push('(');
                        break;
                    case ')':
                        if (!s.isEmpty()) {
                            s.pop();
                        } else {
                            b = false;
                            break;
                        }
                        break;
                }
            }

            if (b && s.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}