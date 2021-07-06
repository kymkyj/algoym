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
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        bridge = new int[n][n];
        StringTokenizer st = null;
        for(int i=0; i<n; i++){

        }
    }
}
