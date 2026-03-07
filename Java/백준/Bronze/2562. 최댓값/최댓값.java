import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        
        int max = 0;
        int index = 0;
        int count = 1;
        for (int i : list) {
            if (i > max) {
                max = i;
                index = count;
            }
            count++;
        }
        
        sb.append(max).append("\n").append(index);
        
        System.out.println(sb);
    }
}