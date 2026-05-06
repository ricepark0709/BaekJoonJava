class Solution {
    public String solution(String[] seoul) {
        int answer = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = i;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ").append(answer).append("에 있다");
        
        return sb.toString();
    }
}