import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int time = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'C') {
                time += 3;
            } else if (s.charAt(i) <= 'F') {
                time += 4;
            } else if (s.charAt(i) <= 'I') {
                time += 5;
            } else if (s.charAt(i) <= 'L') {
                time += 6;
            } else if (s.charAt(i) <= 'O') {
                time += 7;
            } else if (s.charAt(i) <= 'S') {
                time += 8;
            } else if (s.charAt(i) <= 'V') {
                time += 9;
            } else if (s.charAt(i) <= 'Z') {
                time += 10;
            }
        }
        System.out.println(time);
    }
}