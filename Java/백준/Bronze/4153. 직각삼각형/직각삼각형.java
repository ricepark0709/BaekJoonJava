import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static boolean t = true;
    
    public static int findMax(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else if (c > a && c > b) return c;
        else return -1;
    }
    
    public static void main(String[] args) throws IOException {
        while (t) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0 && c == 0) {
                t = false;
                break;
            }
            int max = findMax(a, b, c);
            if (max == -1) {
                t = false;
                break;
            }
            
            if (max == a) {
                if (b*b + c*c == a*a) sb.append("right\n");
                else sb.append("wrong\n");
            } else if (max == b) {
                if (a*a + c*c == b*b) sb.append("right\n");
                else sb.append("wrong\n");
            } else {
                if (a*a + b*b == c*c) sb.append("right\n");
                else sb.append("wrong\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}