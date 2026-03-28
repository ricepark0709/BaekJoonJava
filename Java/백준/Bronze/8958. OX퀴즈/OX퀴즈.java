import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static int score = 0, combo = 1;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			score = 0;
			combo = 1;
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (c == 'O') {
					score += combo;
					combo++;
				} else {
					combo = 1;
				}
			}
			
			sb.append(score).append("\n");
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}
}
