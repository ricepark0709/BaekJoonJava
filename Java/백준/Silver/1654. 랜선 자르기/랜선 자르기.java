import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static long[] line;

    static int n;
    static long k, max, result;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Long.parseLong(st.nextToken());

        setLine();

        binarySearch();
        System.out.println(result);
    }

    public static void setLine() throws IOException {
        line = new long[n];
        max = 0;
        for (int i = 0; i < n; i++) {
            line[i] = Integer.parseInt(br.readLine());
            if (line[i] > max) max = line[i];
        }
    }

    public static void binarySearch() {
        long low = 1;
        long high = max;

        while (low <= high) {
            long mid = (low + high) / 2;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += line[i] / mid;
            }

            if (sum >= k) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}