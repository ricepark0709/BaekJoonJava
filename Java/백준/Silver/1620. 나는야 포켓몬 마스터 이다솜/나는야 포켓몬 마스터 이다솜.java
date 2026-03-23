import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    
    static Map<Integer, String> name = new HashMap<>();
    static Map<String, Integer> id = new HashMap<>();
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        setting(n);
        bw.write(result(m));
        bw.flush();
        bw.close();
    }
    
    public static void setting(int n) throws IOException {
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            name.put(i+1, str);
            id.put(str, i+1);
        }
    }
    
    public static String result(int m) throws IOException {
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            char c = str.charAt(0);
            if (Character.isDigit(c)) {
                sb.append(name.get(Integer.parseInt(str)) + "\n");
            } else {
                sb.append(id.get(str) + "\n");
            }
        }
        
        return sb.toString();
    }
}