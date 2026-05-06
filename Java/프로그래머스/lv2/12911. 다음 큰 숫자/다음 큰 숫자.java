class Solution {
    public int solution(int n) {
        String str = Integer.toBinaryString(n);
        int num = 0;
        for (int i = 0; i < str.length(); i++) if (str.charAt(i) == '1') num++;
        
        int result = 0;
        for (int i = n + 1; i <= 1000000; i++) {
            String answer = Integer.toBinaryString(i);
            int oneNum = 0;
            for (int j = 0; j < answer.length(); j++) if (answer.charAt(j) == '1') oneNum++;
            if (oneNum == num) {
                result = i;
                break;
            }
        }

        return result;
    }
}