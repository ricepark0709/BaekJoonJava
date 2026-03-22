import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr = new int[5001];

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 5000; i++) arr[i] = -1;

        arr[3] = 1;
        arr[5] = 1;
        arr[6] = 2;
        arr[8] = 2;

        for (int i = 9; i <= 5000; i++) {
            int three = arr[i-3];
            int five = arr[i-5];
            int a = 0;
            int b = 0;
            if (three != -1) a = three + 1;
            if (five != -1) b = five + 1;

            if (three != -1 && five != -1) {
                arr[i] = Math.min(a, b);
            } else if (three == -1 && five != -1) {
                arr[i] = b;
            } else if (three != -1 && five == -1) {
                arr[i] = a;
            }
        }

        System.out.println(arr[n]);
    }
}