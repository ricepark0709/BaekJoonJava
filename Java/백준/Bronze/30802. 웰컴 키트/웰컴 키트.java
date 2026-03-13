import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        
        int totalT = 0;
        for (int i = 0; i < 6; i++) {
            if (arr[i] > 0) {
                totalT += (arr[i] + t - 1) / t;
            }
        }
        
        sb.append(totalT + "\n").append(total/p).append(" ").append(total%p);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}