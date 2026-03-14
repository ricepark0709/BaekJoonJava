import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] zero = new int[51];
    static int[] one = new int[50];
    
    public static void fillArr() {
        for (int i = 2; i < 51; i++) {
            zero[i] = zero[i-2] + zero[i-1];
        }
        for (int i = 0; i < 50; i++) {
            one[i] = zero[i+1];
        }
    }
    
    public static void putout(int n) {
        sb.append(zero[n]).append(" ").append(one[n]).append("\n");
    }
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        zero[0] = 1;
        zero[1] = 0;
        fillArr();
        
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            putout(num);
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}