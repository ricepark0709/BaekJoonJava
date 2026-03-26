import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static int[] arr;
    static Map<Integer, Integer> map = new HashMap<>();
    static ArrayList<Integer> num = new ArrayList<>();

    static int n;
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        write();
    }

    public static void fillArr() throws IOException {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (map.containsKey(arr[i])) {
                int num = map.get(arr[i]);
                num++;
                map.put(arr[i], num);
            } else {
                map.put(arr[i], 1);
            }
        }
        Arrays.sort(arr);
    }

    public static void avg(){
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = Math.round((double)sum/(double)n);
        sb.append((int)avg).append("\n");
    }

    public static void mid() {
        sb.append(arr[(n-1)/2]).append("\n");
    }

    public static void mode() {
        int max = 0;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > max) {
                max = i.getValue();
                num.clear();
                num.add(i.getKey());
            } else if (i.getValue() == max) {
                num.add(i.getKey());
            }
        }

        Collections.sort(num);

        if (num.size() == 1) {
            sb.append(num.get(0)).append("\n");
        } else {
            sb.append(num.get(1)).append("\n");
        }
    }

    public static void range() {
        sb.append(arr[n-1] - arr[0]).append("\n");
    }

    public static void write() throws IOException {
        fillArr();
        avg();
        mid();
        mode();
        range();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}