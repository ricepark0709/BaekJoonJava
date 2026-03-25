import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            boolean[] used = new boolean[26];
            boolean isGroupWord = true;
            
            for (int j = 0; j < word.length(); j++) {
                int now = word.charAt(j); 
                if (used[now - 'a'] == false) {
                    used[now - 'a'] = true;
                } else if (word.charAt(j) != word.charAt(j - 1)) {
                    isGroupWord = false; 
                    break;
                }
            }
            
            if (isGroupWord) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}