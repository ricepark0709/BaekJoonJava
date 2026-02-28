import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        int n_2 = n;
        int arrlen = 0;
        while(n_2 > 0) {
            n_2 /= b;
            arrlen++;
        }
        
        int[] arr = new int[arrlen];
        n_2 = n;
        for (int i = 0; i < arrlen; i++) {
            arr[i] = n_2%b;
            n_2 = n_2/b;
        }
        
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] < 10) {
                System.out.print((char)(arr[i] + '0'));
            } else {
                System.out.print((char)(arr[i] - 10 + 'A'));
            }
        }
    }
}