import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int n, m, result, combo;
    static String str;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        str = br.readLine();

        check();

        System.out.println(result);
    }

    public static void check() {
        for (int i = 1; i < m - 1; i++) {
            if (str.charAt(i - 1) == 'I' && str.charAt(i) == 'O' && str.charAt(i + 1) == 'I') {
                combo++;
                if (combo == n) {
                    result++;
                    combo--;
                }
                i++;
            } else {
                combo = 0;
            }
        }
    }
}