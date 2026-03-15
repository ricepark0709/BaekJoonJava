import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr = new int[1001];
   
    public static void setArr() {
        arr[1] = 1;
        arr[2] = 2;
        
        for (int i = 3; i <= 1000; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }
    }
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        setArr();
        
        System.out.println(arr[n]);
    }
}