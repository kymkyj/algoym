package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<N; i++){
            String input = br.readLine();
            if(input.equals("push")) {
                int num = Integer.parseInt(br.readLine());
                stack.push(num);
            }else if(input.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            }else if(input.equals("size")) {
                System.out.println(stack.size());
            }else if(input.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }else if(input.equals("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
    }
}
