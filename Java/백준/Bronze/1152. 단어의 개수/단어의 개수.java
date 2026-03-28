import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int wordNum = 1;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wordNum++;
            }
        }
        
        if (s.charAt(0) == ' ') {
            wordNum--;
        }
        
        if (s.charAt(s.length()-1) == ' ') {
            wordNum--;
        }
        
        System.out.println(wordNum);
    }
}