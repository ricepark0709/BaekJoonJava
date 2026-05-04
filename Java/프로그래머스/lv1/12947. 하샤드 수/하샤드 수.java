class Solution {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        int n = str.length();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += str.charAt(i) - '0';
        }
        
        if (x % sum == 0) return true;
        else return false;
    }
}