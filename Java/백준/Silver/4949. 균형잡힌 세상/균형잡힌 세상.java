import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static boolean b = true;

    public static void main(String[] args) throws IOException {
        while (true) {
            String str = br.readLine();
            Deque<Character> small = new ArrayDeque<>();
            Deque<Character> big = new ArrayDeque<>();
            Deque<Character> all = new ArrayDeque<>();
            b = true;
            if (str.equals(".")) break;
            for (int i = 0; i < str.length()-1; i++) {
                switch (str.charAt(i)) {
                    case '(':
                        small.add('(');
                        all.add('(');
                        break;
                    case '[':
                        big.add('[');
                        all.add('[');
                        break;
                    case ')':
                        if (!small.isEmpty() && all.getLast() == '(') {
                            small.pop();
                            all.pollLast();
                        }
                        else {
                            b = false;
                            break;
                        }
                        break;
                    case ']':
                        if (!big.isEmpty() && all.getLast() == '[') {
                            big.pop();
                            all.pollLast();
                        }
                        else {
                            b = false;
                            break;
                        }
                        break;
                }
            }
            if (small.isEmpty() && big.isEmpty() && b) b = true;
            else b = false;

            if (b) sb.append("yes\n");
            else sb.append("no\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}