import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); static StringTokenizer st; static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] nums, result;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine()); n = Integer.parseInt(st.nextToken()); m = Integer.parseInt(st.nextToken());
        nums = new int[n]; result = new int[m]; visited = new boolean[n];
        st = new StringTokenizer(br.readLine()); for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nums);
        dfs(0);
        bw.write(sb.toString()); bw.flush(); bw.close();
    }

    public static void dfs(int depth) {
        if (depth == m) {
            for (int val : result) sb.append(val).append(" ");
            sb.append("\n");
            return;
        }

        int lastValue = -1;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && nums[i] != lastValue) {
                visited[i] = true;
                result[depth] = nums[i];
                lastValue = nums[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}