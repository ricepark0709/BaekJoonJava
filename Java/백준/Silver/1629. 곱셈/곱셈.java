import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static long a, b, c;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        System.out.println(pow(a, b, c));
    }

    public static long pow(long a, long b, long c) {
        if (b == 1) {
            return a % c;
        }

        long temp = pow(a, b / 2, c);

        if (b % 2 == 0) {
            return (temp * temp) % c;
        } else {
            return ((temp * temp % c) * (a % c)) % c;
        }
    }
}