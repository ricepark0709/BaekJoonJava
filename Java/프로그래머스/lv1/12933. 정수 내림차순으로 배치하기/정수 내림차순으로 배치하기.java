class Solution {
    static StringBuilder sb = new StringBuilder();
    
    public long solution(long n) {
        String str = Long.toString(n);
        int[] arr = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int num : arr) {
            sb.append(num);
        }
        
        return Long.parseLong(sb.toString());
    }
}