package inflearn;

import java.util.Stack;

public class inf5CorrectMarkOther {
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            Stack<Character> stack = new Stack<>();
            for(char x : s.toCharArray()){
                if(!stack.isEmpty() && stack.peek() == '(' && x == ')') stack.pop();
                else stack.push(x);
            }
            return stack.isEmpty();
        }
    }
}
