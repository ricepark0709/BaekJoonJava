import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String firstNum = sc.next();
        String secondNum = sc.next();
        String biggerNum = "";
        
        if (firstNum.charAt(2) > secondNum.charAt(2)) {
            biggerNum = firstNum;
        } else if (firstNum.charAt(2) < secondNum.charAt(2)) {
            biggerNum = secondNum;
        } else if (firstNum.charAt(2) == secondNum.charAt(2)) {
            if (firstNum.charAt(1) > secondNum.charAt(1)) {
                biggerNum = firstNum;
            } else if (firstNum.charAt(1) < secondNum.charAt(1)) {
                biggerNum = secondNum;
            } else if (firstNum.charAt(1) == secondNum.charAt(1)) {
                if (firstNum.charAt(0) > secondNum.charAt(0)) {
                    biggerNum = firstNum;
                } else {
                    biggerNum = secondNum;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.print(biggerNum.charAt(2-i));
        }
    }
}