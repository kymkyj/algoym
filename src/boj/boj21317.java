package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 징검다리 건너기(DP)
/*
    5      ->   5
    1 2
    2 3
    4 5
    6 7
    4
 */
public class boj21317 {
    static int n, k;
    static int [][] bridge;
    static int answer = Integer.MAX_VALUE;
    public void DFS(int L, int sum){
        if(L > n) return;
        if(L == n){
            answer = Math.min(answer, sum);
            return;
        }else{
            DFS(L, sum + bridge[L][0]);
            DFS(L, sum + bridge[L][1]);
        }
    }
    public static void main(String[] args) throws IOException {
        boj21317 T = new boj21317();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        bridge = new int[n][n];
        StringTokenizer st = null;
        for(int i=1; i<n; i++){
            st = new StringTokenizer(br.readLine());
            bridge[i][0] = Integer.parseInt(st.nextToken());
            bridge[i][1] = Integer.parseInt(st.nextToken());
        }
        T.DFS(1, 0); // 1번 돌부터 시작한다고 한거랑 0은 합계
        System.out.println(answer);
    }
}
