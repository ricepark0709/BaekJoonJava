import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int result = 1;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int num = n-1;
        int line = 1;
        int combo = 2;

        while (true) {
            if (num <= line * 6) break;
            else {
                line += combo;
                result++;
            }
            combo++;
        }

        if (n == 1) System.out.println(1);
        else System.out.println(combo);
    }
}