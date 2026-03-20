import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long sum;
    static char[] arr;

    public static long math(int a) {
        long sum = 1L;
        for (int i = 1; i <= a; i++) {
            sum *= 31;
            sum %= 1234567891;
        }

        if (a==0) return 1;
        else return sum;
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            sum += (arr[i] - '`') % 1234567891 * math(i);
        }

        System.out.println(sum);
    }
}