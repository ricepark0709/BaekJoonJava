import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Set<String> h = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    static String[] arr;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) h.add(br.readLine());
        arr = new String[h.size()];

        int a = 0;
        for (String str : h) {
            arr[a] = str;
            a++;
        }

        Arrays.sort(arr);

        for (int i = 0; i < h.size()-1; i++) {
            for (int j = i+1; j < h.size(); j++) {
                if (arr[i].length() > arr[j].length() || (arr[i].length()==arr[j].length() && arr[i].compareTo(arr[j]) > 0)) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (String str : arr) sb.append(str).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}