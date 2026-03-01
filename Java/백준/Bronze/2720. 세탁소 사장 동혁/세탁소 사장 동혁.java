import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int q = 0;
            int d = 0;
            int n = 0;
            int p = 0;
            int money = sc.nextInt();
            q = money/25;
            d = (money%25)/10;
            n = ((money%25)%10)/5;
            p = ((money%25)%10)%5;
            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}