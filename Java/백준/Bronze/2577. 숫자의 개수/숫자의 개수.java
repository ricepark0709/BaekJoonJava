import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int a, b, c, sum;
    static int[] arr = new int[10];
    
    public static void main(String[] args) throws IOException {
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        sum = a * b * c;
        
        String str = Integer.toString(sum);
        
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '0':
                    arr[0]++;
                    break;
                case '1':
                    arr[1]++;
                    break;
                case '2':
                    arr[2]++;
                    break;
                case '3':
                    arr[3]++;
                    break;
                case '4':
                    arr[4]++;
                    break;
                case '5':
                    arr[5]++;
                    break;
                case '6':
                    arr[6]++;
                    break;
                case '7':
                    arr[7]++;
                    break;
                case '8':
                    arr[8]++;
                    break;
                case '9':
                    arr[9]++;
                    break;
            }
        }
        
        for (int i : arr) {
            sb.append(i).append("\n");
        }
        
        System.out.println(sb);
    }
}