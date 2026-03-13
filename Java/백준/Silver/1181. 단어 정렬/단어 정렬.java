import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (!list.contains(str)) {
                list.add(str);
            }
        }
        
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }
                return s1.compareTo(s2);
            }
        });
        
        for (String str : list) {
            sb.append(str + "\n");
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}