package bojNaming;

/*
    4       0
    3
    0
    4
    0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    문제풀이
    잘못된 수를 부를 때마다 0을 외쳐서 최근수를 초기화

 */
public class bojZero {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>(); // 최근꺼를 빼줘야하니까?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++){
            
        }
    }
}
