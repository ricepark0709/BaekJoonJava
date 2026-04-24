import java.io.*;
import java.util.*;

class Point {
    int r, c;
    Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class Main {
    static int n, m;
    static List<Point> houses = new ArrayList<>();
    static List<Point> chickens = new ArrayList<>();
    static int minCityDistance = Integer.MAX_VALUE;
    static boolean[] selected;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int val = Integer.parseInt(st.nextToken());
                if (val == 1) houses.add(new Point(i, j));
                else if (val == 2) chickens.add(new Point(i, j));
            }
        }

        selected = new boolean[chickens.size()];
        backtrack(0, 0);
        System.out.println(minCityDistance);
    }

    public static void backtrack(int start, int depth) {
        if (depth == m) {
            calculateDistance();
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            selected[i] = true;
            backtrack(i + 1, depth + 1);
            selected[i] = false;
        }
    }

    public static void calculateDistance() {
        int totalDistance = 0;

        for (Point h : houses) {
            int minH = Integer.MAX_VALUE;
            for (int i = 0; i < chickens.size(); i++) {
                if (selected[i]) {
                    int dist = Math.abs(h.r - chickens.get(i).r) + Math.abs(h.c - chickens.get(i).c);
                    minH = Math.min(minH, dist);
                }
            }
            totalDistance += minH;

            if (totalDistance >= minCityDistance) return;
        }

        minCityDistance = Math.min(minCityDistance, totalDistance);
    }
}