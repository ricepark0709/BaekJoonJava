import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int yaksu, baesu;
    static boolean yesYaksu = false;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= Math.max(a, b); i++) {
            if (a%i==0 && b%i==0) {
                yaksu = i;
                yesYaksu = true;
            }
        }

        if (!yesYaksu) yaksu = 1;

        for (int i = 1; i <= 100000000; i++) {
            if (i%a==0 && i%b==0) {
                baesu = i;
                break;
            }
        }

        System.out.println(yaksu);
        System.out.println(baesu);
    }
}