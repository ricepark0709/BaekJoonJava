import java.io.*;
import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if (c == stack.peek()) {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            } else stack.add(c);
        }
        
        return (stack.isEmpty()) ? 1 : 0;
    }
}