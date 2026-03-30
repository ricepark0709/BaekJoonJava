import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] arr;
    static int[] count = new int[10];

    static int n, typeCount = 0, left = 0, result;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        setArr();
        process();

        System.out.println(result);
    }

    public static void setArr() throws IOException {
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        for (int right = 0; right < n; right++) {
            count[arr[right]]++;
            if (count[arr[right]] == 1) {
                typeCount++;
            }

            while (typeCount > 2) {
                count[arr[left]]--;
                if (count[arr[left]] == 0) {
                    typeCount--;
                }
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
    }
}