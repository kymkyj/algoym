package bojNaming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bojBalanceWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        char temp;
        while (true) {
            stack.clear();
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                temp = s.charAt(i);
                if (temp == '(' || temp == '[') {
                    stack.push(temp);
                } else if (temp == ')' || temp == ']') {
                    if (stack.isEmpty() || (stack.peek() == '(' && temp == ']') || (stack.peek() == '[' && temp == ')')) {
                        stack.push(temp);
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty())
                System.out.println("no");
            else
                System.out.println("yes");

        }
    }
}
