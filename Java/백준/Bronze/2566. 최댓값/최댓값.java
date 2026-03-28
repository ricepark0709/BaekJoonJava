import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[9][9];
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        
        int max = 0;
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    a = i+1;
                    b = j+1;
                }
            }
        }
        
        System.out.println(max);
        System.out.println(a + " " + b);
    }
}