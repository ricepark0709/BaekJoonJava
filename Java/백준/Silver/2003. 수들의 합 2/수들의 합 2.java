import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        Deque<Integer> list = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }

        while (!list.isEmpty()) {
            int sum = 0;
            int i = 0;
            while (sum < m) {
                sum += list.peekFirst();
                list.offer(list.poll());
                i++;
                if (i > list.size()) break;
                if (sum == m) {
                    count++;
                    for (int j = 0; j < i; j++) {
                        list.addFirst(list.pollLast());
                    }
                    break;
                } else if (sum > m) {
                    for (int j = 0; j < i; j++) {
                        list.addFirst(list.pollLast());
                    }
                    break;
                }
            }
            list.poll();
        }

        System.out.println(count);
    }
}