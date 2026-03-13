import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int c = 1;
        int d = 1;
        int e = a - b;
        int f = 1;
        
        for (int i = 1; i <= a; i++) {
            c *= i;
        }
        
        for (int i = 1; i <= b; i++) {
            d *= i;
        }
        
        for (int i = 1; i <= e; i++) {
            f *= i;
        }
        
        System.out.println(c/(d*f));
    }
}