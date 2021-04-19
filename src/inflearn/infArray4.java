package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수열
public class infArray4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int x : Solution(N)){
            System.out.print(x + " ");
        }
    }
    public static int[] Solution(int N){
        int [] answer = new int[N];
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2; i<N; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }
}
