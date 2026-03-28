import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next(); // "ZZZZZ" 같은 문자열 입력받기
        int B = sc.nextInt();  // "36" 같은 진법 입력받기
        

        long result = Long.parseLong(N, B);
        
        System.out.println(result);
    }
}