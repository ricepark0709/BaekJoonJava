import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[21];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "add":
                    int num = Integer.parseInt(st.nextToken());
                    arr[num] = true;
                    break;
                case "remove":
                    int num2 = Integer.parseInt(st.nextToken());
                    arr[num2] = false;
                    break;
                case "check":
                    int num3 = Integer.parseInt(st.nextToken());
                    if (arr[num3]) sb.append(1 + "\n");
                    else sb.append(0 + "\n");
                    break;
                case "toggle":
                    int num4 = Integer.parseInt(st.nextToken());
                    arr[num4] = !arr[num4];
                    break;
                case "all":
                    Arrays.fill(arr, true);
                    break;
                case "empty":
                    Arrays.fill(arr, false);
                    break;
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}