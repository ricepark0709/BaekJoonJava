import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean threesix(int a) {
        String str = String.valueOf(a);
        int[] arr = new int[str.length()];
        boolean b = false;
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = a%10;
            a /= 10;
        }
        for (int i = 0; i < str.length()-2; i++) {
            if (arr[i] == 6 && arr[i+1] == 6 && arr[i+2] == 6) {
                b = true;
                break;
            }
        }
        
        return b;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean b = true;
        
        int s = 0; // n이랑 비교
        int i = 0; // 숫자
        while (b) {
            i++;
            if (threesix(i)) s++;
            if (s == n) {
                b = false;
                break;
            }
        }
        
        System.out.println(i);
    }
}