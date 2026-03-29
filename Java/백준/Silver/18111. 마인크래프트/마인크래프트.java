import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[][] land;

    static int n, m, b, result = Integer.MAX_VALUE, y = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        setLand();
        minecraft();

        sb.append(result).append(" ").append(y);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

        br.close();
    }

    public static void setLand() throws IOException {
        land = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                land[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void minecraft() {
        int height = 0;

        while (height <= 256) {
            int craft = 0;
            int block = b;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (land[i][j] > height) {
                        craft += (land[i][j] - height) * 2;
                        block += land[i][j] - height;
                    } else if (land[i][j] < height) {
                        craft += height - land[i][j];
                        block -= height - land[i][j];
                    }
                }
            }

            if (block >= 0) {
                if (result > craft) {
                    result = craft;
                    y = height;
                } else if (result == craft) {
                    y = height;
                }
            }

            height++;
        }
    }
}