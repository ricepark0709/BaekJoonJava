import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] canvas = new boolean[100][100];
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int l = sc.nextInt();
            for (int j = w; j < w+10; j++) {
                for (int k = l; k < l+10; k++) {
                    canvas[j][k] = true;
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (canvas[i][j]) {
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
}