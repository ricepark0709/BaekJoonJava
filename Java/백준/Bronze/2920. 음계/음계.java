import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static boolean up = true, down = true;
    static int[] arr = new int[8];
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < 7; i++) {
            if (arr[i] + 1 != arr[i+1]) {
                up = false;
            }
        }
        
        for (int i = 0; i < 7; i++) {
            if (arr[i] - 1 != arr[i+1]) {
                down = false;
            }
        }
        
        if (up) System.out.println("ascending");
        else if (down) System.out.println("descending");
        else System.out.println("mixed");
    }
}