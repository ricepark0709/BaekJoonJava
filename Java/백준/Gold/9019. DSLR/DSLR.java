import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int t, a, b;

    static String[] command;
    static boolean[] visited;
    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bfs(a, b);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void bfs(int start, int goal) {
        command = new String[10000];
        visited = new boolean[10000];
        q = new LinkedList<>();

        q.add(start);
        visited[start] = true;
        Arrays.fill(command, "");

        while (!q.isEmpty() && !visited[goal]) {
            int curr = q.poll();

            int D = (curr * 2) % 10000;
            if (!visited[D]) {
                q.add(D);
                visited[D] = true;
                command[D] = command[curr] + "D";
            }

            int S = curr == 0 ? 9999 : curr - 1;
            if (!visited[S]) {
                q.add(S);
                visited[S] = true;
                command[S] = command[curr] + "S";
            }

            int L = (curr % 1000) * 10 + (curr / 1000);
            if (!visited[L]) {
                q.add(L);
                visited[L] = true;
                command[L] = command[curr] + "L";
            }

            int R = (curr % 10) * 1000 + (curr / 10);
            if (!visited[R]) {
                q.add(R);
                visited[R] = true;
                command[R] = command[curr] + "R";
            }
        }
        sb.append(command[goal]).append("\n");
    }
}