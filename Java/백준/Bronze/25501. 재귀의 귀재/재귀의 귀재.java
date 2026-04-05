import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static int n, num;
    static boolean isP;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            num = 0; isP = true;
            recursion(str, 0);
            if (isP) sb.append(1).append(" ").append(num + 1).append('\n');
            else sb.append(0).append(" ").append(num + 1).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void recursion(String str, int i) {
        if (i >= str.length() - 1 - i) {
            return;
        }

        if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            num++;
            i++;
            recursion(str, i);
        } else {
            isP = false;
        }
    }
}