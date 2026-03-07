import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String type = st.nextToken();
        int p = 0;
        switch (type) {
            case "Y":
                p = 2;
                break;
            case "F":
                p = 3;
                break;
            case "O":
                p = 4;
                break;
        }
        HashSet<String> player = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (!player.contains(name)) player.add(name);
        }
        
        System.out.println(player.size()/(p-1));
    }
}