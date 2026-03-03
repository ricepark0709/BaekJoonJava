import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            list.add(p);
        }
        int e = sc.nextInt();
        int count = 0;
        for (Integer d : list) {
            if (d == e) {
                count++;
            }
        }
        System.out.println(count);
    }
}