import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int add = 0;
        
        for (int i = 0; i < n; i++) {
            add += Math.pow(2, i);
        }
        
        int result = 2+add;
        System.out.println(result*result);
    }
}