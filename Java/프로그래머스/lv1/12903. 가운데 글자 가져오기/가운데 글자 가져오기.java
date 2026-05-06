class Solution {
    public String solution(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        if (n % 2 != 0) {
            sb.append(s.charAt(n/2));
        } else {
            sb.append(s.charAt(n/2-1)).append(s.charAt(n/2));
        }
        
        return sb.toString();
    }
}