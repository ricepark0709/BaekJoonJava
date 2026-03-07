import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken(); // enter 또는 leave

            if (action.equals("enter")) {
                hs.add(name);
            } else {
                hs.remove(name);
            }
        }
        
        // 1. HashSet을 List로 변환 (정렬하기 위해)
        List<String> result = new ArrayList<>(hs);
        
        // 2. 내림차순 정렬 (역순)
        Collections.sort(result, Collections.reverseOrder());
        
        // 3. StringBuilder로 출력 모으기
        StringBuilder sb = new StringBuilder();
        for (String str : result) {
            sb.append(str).append("\n");
        }
        
        System.out.print(sb);
    }
}