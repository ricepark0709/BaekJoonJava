import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            switch (m) {
                case 1:
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (!deque.isEmpty()) System.out.println(deque.pollFirst());
                    else System.out.println(-1);
                    break;
                case 4:
                    if (!deque.isEmpty()) System.out.println(deque.pollLast());
                    else System.out.println(-1);
                    break;
                case 5:
                    System.out.println(deque.size());
                    break;
                case 6:
                    if (deque.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case 7:
                    if (!deque.isEmpty()) System.out.println(deque.peekFirst());
                    else System.out.println(-1);
                    break;
                case 8:
                    if (!deque.isEmpty()) System.out.println(deque.peekLast());
                    else System.out.println(-1);
                    break;
            }
        }
    }
}