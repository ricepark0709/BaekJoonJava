import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int line = 0;
        int i = 0;
        
        while (true) {
            if ((n - 1) <= (line * 6)) {
                break;
            } else {
                i++;
                line += i;
            }
        }
        int result = i + 1;
        System.out.println(result);
    }
}