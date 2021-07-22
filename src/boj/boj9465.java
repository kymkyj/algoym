package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj9465 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr;
        int[][] dp;
        String[] str;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N+1][2];
            dp = new int[N+1][2];
            for (int j = 0; j < 2; j++) {
                str = br.readLine().split(" ");
                for (int k = 1; k <=N; k++) {
                    arr[j][i] = Integer.parseInt(str[j-1]);
                }
            }

            dp[1][0] = arr[1][0];
            dp[1][1] = arr[1][1];
            for(int j=2; j<=N; j++){
                dp[j][0] = Math.max(dp[j-1][1],dp[j-2][1] ) + arr[j][0];
                dp[j][1] = Math.max(dp[j-1][0],dp[j-2][0] ) + arr[j][1];
            }
            System.out.println(Math.max(dp[N][0], dp[N][1]));
        }
    }
}

