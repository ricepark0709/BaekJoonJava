import java.io.*;
import java.util.*;

public class Main {
    
    public static int digitNum(int n) {
        if (n < 10) return 1;
        else if (n < 100) return 2;
        else if (n < 1000) return 3;
        else return 4;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            switch (digitNum(i)) {
                case 1:
                    count++;
                    break;
                case 2:
                    count++;
                    break;
                case 3:
                    int[] arr = new int[3];
                    int temp = i;
                    for (int j = 0; j < 3; j++) {
                        arr[j] = temp%10;
                        temp /= 10;
                    }
                    if (arr[0] - arr[1] == arr[1] - arr[2]) count++;
                    break;
                case 4:
                    break;
            }
        } 
        
        System.out.println(count);
    }
}