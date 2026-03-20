import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr;
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int no = 0;
        for (int a : arr) {
            for (int i = 2; i <= 1000; i++) {
                if (a==1) {
                    no++;
                    break;
                }
                if (a%i == 0 && a!=i) {
                    no++;
                    break;
                }
            }
        }
        
        System.out.println(n-no);
    }
}