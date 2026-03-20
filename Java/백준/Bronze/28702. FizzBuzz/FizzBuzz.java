import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int num, index;

    public static void main(String[] args) throws IOException {
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < 3; i++) {
            if (!(arr[i].equals("Fizz")) && !(arr[i].equals("Buzz")) && !(arr[i].equals("FizzBuzz"))) {
                num = Integer.parseInt(arr[i]);
                index = i;
            }
        }

        if (index == 0) num+=3;
        else if (index == 1) num+=2;
        else num+=1;

        if (num%3==0 && num%5==0) System.out.println("FizzBuzz");
        else if (num%3==0) System.out.println("Fizz");
        else if (num%5==0) System.out.println("Buzz");
        else System.out.println(num);
    }
}