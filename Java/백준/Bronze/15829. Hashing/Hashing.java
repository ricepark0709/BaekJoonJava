import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static double sum;
    static double to;
    static char[] arr;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            to = Math.pow(31, i) % 1234567891;
            sum += (arr[i] - '`') % 1234567891 * to;
        }

        System.out.println((int)sum);
    }
}