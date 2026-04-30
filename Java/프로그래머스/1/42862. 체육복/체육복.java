import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 2];
        Arrays.fill(student, 1);
        student[0] = student[n + 1] = 0;
        
        for (int i = 0; i < reserve.length; i++) {
            int num = reserve[i];
            student[num] = 2;
        }
        
        for (int i = 0; i < lost.length; i++) {
            int num = lost[i];
            student[num]--;
        }
        
        for (int i = 1; i <= n; i++) {
            if (student[i] == 0) {
                if (student[i - 1] == 2) {
                    student[i - 1] = 1;
                    student[i] = 1;
                } else if (student[i + 1] == 2) {
                    student[i + 1] = 1;
                    student[i] = 1;
                }
            }
        }
        
        int answer = n;
        for (int i = 1; i <= n; i++) {
            if (student[i] == 0) answer--;
        }
        
        return answer;
    }
}