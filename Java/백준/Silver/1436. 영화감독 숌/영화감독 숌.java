import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean threeSix(int n) {
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        int combo = 0;
        boolean threeSix = false;

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
            if (arr[i] == '6') {
                combo++;
                if (combo == 3) threeSix = true;
            } else {
                combo = 0;
            }
        }

        if (threeSix) return true;
        else return false;
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        int whatNum = 0;
        while (whatNum!=n) {
            result++;
            if (threeSix(result)) whatNum++;
        }

        System.out.println(result);
    }
}