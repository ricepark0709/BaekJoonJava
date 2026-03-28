import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] arr = new int[6];
        
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(chess[i] - arr[i] + " ");
        }
    }
}