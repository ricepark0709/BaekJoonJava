import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] arr;

    static int sum = 0, add = 0;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        fillArr(n);
        System.out.println(Calculation(n));
    }

    public static void fillArr(int n) throws IOException {
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
    }

    public static int Calculation(int n) {
        for (int i = 0; i < n; i++) {
            add += arr[i];
            sum += add;
        }
        return sum;
    }
}