import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr;
    static int sum;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int trimN = (int)Math.round(n*0.15);
        int realN = (int)n-2*trimN;

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = trimN; i < n-trimN; i++) {
            sum += arr[i];
        }

        double avg = Math.round((double)sum/(double)realN);
        System.out.println((int)avg);
    }
}