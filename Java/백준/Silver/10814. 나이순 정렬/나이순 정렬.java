import java.io.*;
import java.util.*;

public class Main {
    static class Member {
        int age;
        String name;
        
        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Member[] arr = new Member[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            
            arr[i] = new Member(age, name);
        }
        
        Arrays.sort(arr, (a, b) -> {
            return a.age - b.age;
        });
        
        StringBuilder sb = new StringBuilder();
        for (Member m : arr) {
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}