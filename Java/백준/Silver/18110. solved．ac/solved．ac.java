import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        int trimN = (int) Math.round(n*0.15);
        
        double sum = 0;
        for (int i = trimN; i < n-trimN; i++) {
            sum += arr[i];
        }
        
        int realN = n - 2*trimN;
        System.out.println((int) Math.round(sum/realN));
    }
}