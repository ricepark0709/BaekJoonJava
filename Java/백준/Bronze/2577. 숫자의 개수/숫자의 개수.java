import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int a, b, c, sum;
    static int[] arr = new int[10];
    
    public static void main(String[] args) throws IOException {
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        sum = a * b * c;
        
        String str = Integer.toString(sum);
        
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }
        
        for (int i : arr) {
            sb.append(i).append("\n");
        }
        
        System.out.println(sb);
    }
}