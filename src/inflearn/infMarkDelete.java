package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호문자제거
public class infMarkDelete {
    public static String solution(String s){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == ')'){
                while(stack.pop() != '(');
            }else{
                stack.push(c);
            }
        }
        for(int i=0; i<stack.size(); i++){
            answer += stack.get(i);
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}
