import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        Stack<Integer> s = new Stack<>();

        for (int i = 1; i <= n; i++) {
            s.push(i);
        }

        long sum = 1L;
        while (!s.isEmpty()) {
            sum *= s.pop();
        }

        System.out.println(sum);
    }
}