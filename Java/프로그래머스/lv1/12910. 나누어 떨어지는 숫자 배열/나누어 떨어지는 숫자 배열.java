import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int answerNum = 0;
        boolean[] isDiv = new boolean[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answerNum++;
                isDiv[i] = true;
            }
        }
        
        int[] answer;
        if (answerNum == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else answer = new int[answerNum];
        
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isDiv[i]) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}