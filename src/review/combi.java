package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 조합의 수 정리하기
/*
    조합의 경우로 외워두는 것이 좋다.
 */
public class combi {
    int [][] dy = new int[35][35];
    public int DFS(int n , int r){
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else{
            return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }
    public static void main(String[] args) throws IOException {
        combi T = new combi();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        System.out.println(T.DFS(n, r));
    }
}
