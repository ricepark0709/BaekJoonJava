import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static HashSet<String> set = new HashSet<>();
    static ArrayList<String> list = new ArrayList<>();

    static int count = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        name(n, m);
        
        bw.write(result());
        bw.flush();
        bw.close();
    }

    public static void name (int n, int m) throws IOException {
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                count++;
                list.add(str);
            }
        }

        Collections.sort(list);
    }

    public static String result() {
        sb.append(count + "\n");
        for (String str : list) {
            sb.append(str + "\n");
        }
        
        return sb.toString();
    }
}