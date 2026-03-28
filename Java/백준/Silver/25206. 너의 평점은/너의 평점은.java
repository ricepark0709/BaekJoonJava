import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalGrade = 0;
        double totalCredit = 0;
        
        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double creditNum = sc.nextDouble();
            String grade = sc.next();
            
            if (grade.equals("P")) {
                continue; 
            } else {
                 totalCredit += creditNum;
            }
            
            if (grade.equals("A+")) {
                totalGrade += creditNum*4.5;
            } else if (grade.equals("A0")) {
                totalGrade += creditNum*4;
            } else if (grade.equals("B+")) {
                totalGrade += creditNum*3.5;
            } else if (grade.equals("B0")) {
                totalGrade += creditNum*3;
            } else if (grade.equals("C+")) {
                totalGrade += creditNum*2.5;
            } else if (grade.equals("C0")) {
                totalGrade += creditNum*2;
            } else if (grade.equals("D+")) {
                totalGrade += creditNum*1.5;
            } else if (grade.equals("D0")) {
                totalGrade += creditNum*1.0;
            }
        }
        System.out.println(totalGrade/totalCredit);
    }
}