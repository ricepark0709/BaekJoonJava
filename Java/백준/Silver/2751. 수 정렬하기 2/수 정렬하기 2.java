import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String n = br.readLine();
        int num = Integer.parseInt(n);
        int[] arr = new int[num];
        
        for (int i = 0; i < num; i++) {
            String a = br.readLine();
            arr[i] = Integer.parseInt(a);
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.println(sb);
    }
}