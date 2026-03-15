import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[12];
    
    public static void fill() {
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
    }
    
    public static void dp() {
        for (int i = 4; i < 12; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
    }
    
    public static void result(int n) throws IOException {
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            sb.append(arr[a]).append("\n");
        }
    }
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        fill();
        dp();
        result(n);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}