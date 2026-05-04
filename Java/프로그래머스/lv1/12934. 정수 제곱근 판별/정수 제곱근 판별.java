class Solution {
    public long solution(long n) {
        long root = 0L;
        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                root = i;
            }
            if (i * i > n) break;
        }
        
        if (root == 0) return -1;
        else return (root + 1) * (root + 1);
    }
}