import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int n = getNext(i);
            
            if (n <= 10000) {
                isNotSelfNumber[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!isNotSelfNumber[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static int getNext(int num) {
        int res = num;
        while (num > 0) {
            res += num % 10;
            num /= 10;      
        }
        return res;
    }
}