class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        
        for (int i = str.length(); i > 0; i--) {
            answer[str.length() - i] = str.charAt(i - 1) - '0';
        }
        return answer;
    }
}