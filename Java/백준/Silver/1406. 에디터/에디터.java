import java.util.LinkedList;
import java.util.ListIterator;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        // 리스트의 맨 뒤에 커서(iterator)를 놓습니다.
        ListIterator<Character> iter = list.listIterator(list.size());

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            char h = command.charAt(0);

            switch (h) {
                case 'L':
                    if (iter.hasPrevious()) iter.previous();
                    break;
                case 'D':
                    if (iter.hasNext()) iter.next();
                    break;
                case 'B':
                    if (iter.hasPrevious()) {
                        iter.previous(); // 삭제할 노드로 이동
                        iter.remove();   // 해당 노드 삭제
                    }
                    break;
                case 'P':
                    char t = command.charAt(2); // 'P x' 형태이므로 index 2가 문자
                    iter.add(t);
                    break;
            }
        }

        // 출력도 중요합니다! System.out.println(list)는 너무 느려요.
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}