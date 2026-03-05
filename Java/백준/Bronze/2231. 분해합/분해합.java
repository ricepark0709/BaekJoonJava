import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean b = true;
        
        int num = 0;
        while (b) {
            String str = String.valueOf(num);
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }
            
            if (n == num + sum) {
                b = false;
                System.out.println(num);
            } else {
                num++;
            }
            
            if (num >= n) {
                b = false;
                System.out.println(0);
            }
        }
        
    }
}