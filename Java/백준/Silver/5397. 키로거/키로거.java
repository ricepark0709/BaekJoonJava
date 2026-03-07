import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            LinkedList<Character> list = new LinkedList<>();
            String str = br.readLine();
            ListIterator<Character> iter = list.listIterator(list.size());
            for (char c : str.toCharArray()) {
                switch (c) {
                    case '<':
                        if (iter.hasPrevious()) iter.previous();
                        break;
                    case '>':
                        if (iter.hasNext()) iter.next();
                        break;
                    case '-':
                        if (iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        break;
                    default:
                        iter.add(c);
                }
            }
            for (char c : list) {
                sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}