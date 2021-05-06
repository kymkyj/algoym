package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 올바른 괄호
// 괄호문제가 나오면 고민하지말고 무조건 스택으로 풀자!
public class inf5CorrectMark {
    public static String Solution(String v){
        Stack<Character> s = new Stack<>();
        for(char x : v.toCharArray()){
            if(x == '(') s.push(x);
            else{ // 닫는괄호를 만났음
                if(s.isEmpty()) return "NO";
                else{
                    s.pop();
                }
            }
        }
        if(s.isEmpty()) return "YES"; return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(Solution(input));
    }
}
