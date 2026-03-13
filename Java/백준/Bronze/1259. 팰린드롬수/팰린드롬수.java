import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean b = true;

        while (b) {
            boolean isP = true;
            String str = br.readLine();
            Deque<Character> d = new ArrayDeque<>();

            if (str.equals("0")) {
                b = false;
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                d.offer(str.charAt(i));
            }

            while (d.size() > 1) {
                if (d.pollFirst() != d.pollLast()) {
                    isP = false;
                    sb.append("no\n");
                    break;
                }
            }

            if (isP) sb.append("yes\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}