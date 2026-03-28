import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int i = 0;
        while(i < s.length()) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                break;
            }
            i++;
        }
        
        if (i == s.length()) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}