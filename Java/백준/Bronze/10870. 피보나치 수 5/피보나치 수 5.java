import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
         n = Integer.parseInt(br.readLine());
         setArr();
         if (n > 1) {
             fillArr(2);
         }
         System.out.println(arr[n]);
    }

    public static void setArr() {
        arr = new int[n + 1];
        arr[0] = 0;
        if (n > 0) arr[1] = 1;
    }

    public static void fillArr(int index) {
        if (index < n + 1) {
            arr[index] = arr[index - 2] + arr[index - 1];
            index++;
            fillArr(index);
        }
    }
}