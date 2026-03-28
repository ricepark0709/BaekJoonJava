import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] arr = new int[n*2][m];
        
        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + arr[i+n][j] + " ");
            }
            System.out.println();
        }
    }
}