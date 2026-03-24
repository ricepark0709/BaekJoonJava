import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        setArr();
        result(Integer.parseInt(br.readLine()));
    }

    static int[] arr = new int[11];
    public static void setArr() {
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i <= 10; i++) {
            arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
        }
    }

    public static void result(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}