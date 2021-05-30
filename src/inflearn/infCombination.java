package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 조합의 경우수 구하기
public class infCombination {
    int [][] combi = new int[35][35];
    public int DFS(int n, int r){
        // 이미 재귀가 돌아서 구한 값이냐?
        // 구한값이라면 재귀돌지말고 그 값을 가져와라
        if(combi[n][r] > 0) return combi[n][r];
        if(n == r || r==0) return 1;
        else return combi[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        infCombination T = new infCombination();
        System.out.println(T.DFS(n, r));
    }
}
