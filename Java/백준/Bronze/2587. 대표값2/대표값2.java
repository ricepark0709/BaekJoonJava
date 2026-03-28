import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        double avg = (double)sum / 5.0;
        
        System.out.println((int)avg);
        System.out.println(arr[2]);
    }
}