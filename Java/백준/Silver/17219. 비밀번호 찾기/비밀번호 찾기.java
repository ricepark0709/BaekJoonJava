import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Map<String, String> h = new HashMap<>();
    
    public static void putin(int n) throws IOException {
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pw = st.nextToken();
            h.put(site, pw);
        }
    }
    
    public static void tofind(int n) throws IOException {
        for (int i = 0; i < n; i++) {
            String findSite = br.readLine();
            sb.append(h.get(findSite) + "\n");
        }
    }
    
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int siteNum = Integer.parseInt(st.nextToken());
        int pwNum = Integer.parseInt(st.nextToken());
        
        putin(siteNum);
        tofind(pwNum);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}