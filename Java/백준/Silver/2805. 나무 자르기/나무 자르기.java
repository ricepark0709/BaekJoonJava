import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, m, max = 0, min = 1000000000, result;
    static int[] tree;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        setTree();
        cutTree();

        System.out.println(result);
    }

    public static void setTree() throws IOException {
        st = new StringTokenizer(br.readLine());
        tree = new int[n];
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (tree[i] > max) max = tree[i];
            if (tree[i] < min) min = tree[i];
        }
    }

    public static void cutTree() {
        int low = 0;
        int high = max;
        while (low <= high) {
            long sum = 0;
            int mid = (low + high) / 2;
            for (int i = 0; i < n; i++) {
                if (tree[i] > mid) sum += (tree[i] - mid);
            }

            if (sum >= m) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}