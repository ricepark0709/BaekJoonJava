import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] arr = new int[100001];
    static boolean[] visited = new boolean[100001];

    static int n, k, num;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
            return;
        }

        bfs(n);
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        arr[start] = 1;
        visited[start] = true;

        while (!q.isEmpty()) {
            num = q.poll();

            int[] next = {num - 1, num + 1, num * 2};

            for (int i : next) {
                if (i == k) {
                    System.out.println(arr[num]);
                    return;
                }

                if (i >= 0 && i <= 100000 && !visited[i]) {
                    visited[i] = true;
                    arr[i] = arr[num] + 1;
                    q.add(i);
                }
            }
        }
    }
}