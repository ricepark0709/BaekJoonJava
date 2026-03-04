import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String s = br.readLine();
        int len = s.length();
        int[] arr = new int[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(i) - '0';
        }
        
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < len; i++) {
            sb.append(arr[i]).append("");
        }
        System.out.println(sb);
    }
}