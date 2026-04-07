import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int t;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            input();
            process();
        }
        output();
    }

    static String str;
    static int n;
    static Deque<Integer> d;
    static boolean isForward = true;

    public static void input() throws IOException {
        str = br.readLine();
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), "[],");
        d = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            d.add(Integer.parseInt(st.nextToken()));
        }
    }

    public static void process() {
        isForward = true;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'R':
                    isForward = !isForward;
                    break;
                case 'D':
                    if (!d.isEmpty()) {
                        if (isForward) d.pollFirst();
                        else d.pollLast();
                    } else {
                        sb.append("error").append('\n');
                        return;
                    }
                    break;
            }
        }
        
        if (d.isEmpty()) {
            sb.append("[]").append('\n');
            return;
        }
        
        sb.append('[');
        while (!d.isEmpty()) {
            if (isForward) sb.append(d.pollFirst()).append(',');
            else sb.append(d.pollLast()).append(',');
        }
        sb.replace(sb.length() - 1, sb.length(), "]").append('\n');
    }

    public static void output() throws IOException {
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}