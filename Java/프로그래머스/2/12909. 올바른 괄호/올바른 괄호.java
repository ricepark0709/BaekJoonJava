import java.io.*;
import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        boolean isRight = true;
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    stack.add('(');
                    break;
                case ')':
                    if (stack.isEmpty()) isRight = false;
                    else stack.pop();
            }
        }
        
        if (!stack.isEmpty()) isRight = false;
        
        if (isRight) return true;
        else return false;
    }
}