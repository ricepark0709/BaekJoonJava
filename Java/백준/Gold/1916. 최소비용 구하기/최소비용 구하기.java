import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    int end, weight;
    public Node (int end, int weight) {
        this.end = end;
        this.weight = weight;
    }
    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, m;
    static ArrayList<Node>[] adj;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj[s].add(new Node(e, w));
        }

        st = new StringTokenizer(br.readLine());
        int startNode = Integer.parseInt(st.nextToken());
        int endNode = Integer.parseInt(st.nextToken());

        System.out.println(dijkstra(startNode, endNode));
    }

    public static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            if (curr.weight > dist[curr.end]) continue;

            for (Node next : adj[curr.end]) {
                if (dist[next.end] > dist[curr.end] + next.weight) {
                    dist[next.end] = dist[curr.end] + next.weight;
                    pq.add(new Node(next.end, dist[next.end]));
                }
            }
        }
        return dist[end];
    }
}