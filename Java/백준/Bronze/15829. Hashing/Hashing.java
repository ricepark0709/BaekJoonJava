import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        long sum = 0L;
        long T = 1L;
        
        for (int i = 0; i < n; i++) {
            sum += ((str.charAt(i) - '`') * T) % 1234567891;
            T = (T * 31) % 1234567891;
        }
        
        System.out.println(sum%1234567891);
    }
}