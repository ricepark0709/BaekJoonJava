class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_Num = 0; int y_Num = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') p_Num++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') y_Num++;
        }
        
        if (p_Num == y_Num) answer = true;
        else answer = false;
        
        return answer;
    }
}