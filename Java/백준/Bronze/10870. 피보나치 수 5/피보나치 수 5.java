import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>(); // 원래 스택
        Stack<Integer> s2 = new Stack<>(); // 대피시킬 스택
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n + 3; i++) {
            if (s.size() > 2) {
                int newNum = 0;
                for (int j = 0; j < 2; j++) {
                    int a = s.pop();
                    s2.push(a);
                    newNum += a;
                }
                for (int k = 0; k < 2; k++) {
                    s.push(s2.pop());
                }
                s.push(newNum);
            } else if (s.size() == 1) s.push(1);
            else s.push(0);
        }

        System.out.println(s.pop());
    }
}