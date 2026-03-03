import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        
        for (Integer l : list) {
            if (l < x) {
                System.out.print(l + " ");
            }
        }
    }
}