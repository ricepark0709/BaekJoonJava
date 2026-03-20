import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int sum, count, where, result;

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        sum = 0;
        count = 0;
        while (count < str.length()) {
            char c = str.charAt(count);
            if (c!='*' && count%2==0) {
                sum += c-'0';
            } else if (c!='*' && count%2!=0) {
                sum += 3*(c-'0');
            }
            if (c == '*') where = count;
            count++;
        }

        where++;
        for (int i = 0; i < 10; i++) {
            if (where%2==0) {
                if ((sum+3*i)%10==0) {
                    result = i;
                    break;
                }
            } else {
                if ((sum+i)%10==0) {
                    result = i;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}