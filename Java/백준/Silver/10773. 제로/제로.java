import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Stack<Integer> s = new Stack<>();
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) s.pop();
            else s.push(num);
        }

        while (!s.isEmpty()) sum += s.pop();

        System.out.println(sum);
    }
}