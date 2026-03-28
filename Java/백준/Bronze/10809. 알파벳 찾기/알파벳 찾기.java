import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        char n = 'a';
        
        for (int i = 0; i < 26; i++) {
            System.out.print(s.indexOf(n) + " ");
            n = (char)(n + 1);
        }
    }
}