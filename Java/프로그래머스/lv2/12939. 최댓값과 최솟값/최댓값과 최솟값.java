import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        
        int[] num = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(num);
        
        StringBuilder sb = new StringBuilder();
        sb.append(num[0]).append(" ").append(num[num.length - 1]);
        return sb.toString();
    }
}