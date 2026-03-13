import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean process(int a, int b, int c) {
        int first = 0;
        int second = 0;
        int third = 0;
        if (a > b && a > c) {
            first = a;
            if (b > c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (b > a && b > c) {
            first = b;
            if (a > c) {
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else {
            first = c;
            if (a > b) {
                second = a;
                third = b;
            } else {
                second = b;
                third = a;
            }
        }
        
        if (((second*second) + (third*third)) == first*first) return true;
        else return false;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean t = true;
        
        while (t) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                t = false;
                break;
            }
            if (process(a, b, c)) sb.append("right\n");
            else sb.append("wrong\n");
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}