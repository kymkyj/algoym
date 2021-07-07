package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 5
/*
    10  -> 55
 */
public class boj10870 {
    static int [] fibo; // 메모이제이션
    public static int DFS(int n){
        if(fibo[n] > 1) return fibo[n];
        if(n==0) return fibo[n] = 0;
        else if(n==1) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }
    public static void main(String[] args) throws IOException {
        boj10870 T = new boj10870();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n+1];
        System.out.println(T.DFS(n));
    }
}
