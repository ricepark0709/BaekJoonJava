import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, result, sum;
    static boolean b = false;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 1000000; i++) {
            String strI = Integer.toString(i);

            int j = 0;
            sum = 0;
            while (j < strI.length()) {
                sum += strI.charAt(j) - '0';
                j++;
            }
            
            if ((sum + i) == n) {
                b = true;
                result = i;
                break;
            }
        }

        if (b) System.out.println(result);
        else System.out.println(0);
    }
}