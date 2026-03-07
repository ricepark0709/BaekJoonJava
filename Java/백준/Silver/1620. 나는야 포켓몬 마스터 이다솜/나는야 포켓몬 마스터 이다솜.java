import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner보다 빠른 BufferedReader 사용 권장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 포켓몬 개수
        int M = Integer.parseInt(st.nextToken()); // 문제 개수

        // 두 가지 방식으로 저장 (번호 -> 이름, 이름 -> 번호)
        String[] nameArray = new String[N + 1]; // 번호로 찾기용 (배열이 Map보다 빠름)
        Map<String, Integer> nameToNum = new HashMap<>(); // 이름으로 찾기용

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameArray[i] = name;
            nameToNum.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            
            // 입력이 숫자인지 문자인지 판별
            if (isNumeric(query)) {
                int index = Integer.parseInt(query);
                sb.append(nameArray[index]).append("\n");
            } else {
                sb.append(nameToNum.get(query)).append("\n");
            }
        }
        System.out.print(sb);
    }

    // 숫자인지 확인하는 간단한 메서드
    public static boolean isNumeric(String str) {
        char c = str.charAt(0);
        return c >= '0' && c <= '9';
    }
}