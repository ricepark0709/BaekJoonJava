import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long sum;
    static char[] arr;
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);
        }
        
        for (int i = 0; i < n; i++) {
            sum += (arr[i] - '`') * Math.pow(31, i);
        }
        
        System.out.println(sum);
    }
}