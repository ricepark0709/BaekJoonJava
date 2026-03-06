import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        int count = 0;
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            s.push(num);
        }
        
        while (!s.isEmpty()) {
            int a = s.pop();
            if (a > max) {
                max = a;
                count++;
            }
        }
        
        System.out.println(count);
    }
}