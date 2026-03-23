import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr = new int[1000001];

    public static void main(String[] args) throws IOException {
        System.out.println(fillArr(Integer.parseInt(br.readLine())));
    }

    public static int fillArr(int n) {
        arr[1] = arr[2] = arr[3] = 1;
        for (int i = 4; i <= 1000000; i++) {
            if (i % 6 == 0) arr[i] = Math.min(arr[i/3], arr[i/2]) + 1;
            else if (i % 3 == 0) arr[i] = Math.min(arr[i/3], arr[i-1]) + 1;
            else if (i % 2 == 0) arr[i] = Math.min(arr[i/2], arr[i-1]) + 1;
            else arr[i] = arr[i-1] + 1;
        }
        if (n == 1) return 0;
        else return arr[n];
    }
}