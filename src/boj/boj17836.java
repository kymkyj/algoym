package boj;
// 공주님을 구하라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 용사는 처음에는 그람이 없어서 마법벽을 부술 수 없다.
 * 용사의 처음 위치는 1,1 / 공주는 N, M 에 위치한다.
 * T시간 이내로 공주를 구출못하면 Fail
 * 용사는 한칸 이동하는데 1시간걸린다.
 * 용사는 상하좌우로 이동할 수 있다.
 * 그람이라는 명검이 어딘가에 하나 반드시 존재한다.
 * 그람을 얻게되면 마법벽을 부수고 나아갈 수 있다.
 * 공주님을 구하는데 최소시간을 구하라
 *
 * N과 M 그리고 T가 주어진다.
 * 0은 빈공간 1은 마법벽 2는 그람 / 1,1과 N,M은 0이다.
 */
/*
    6 6 16          ->      10
    0 0 0 0 1 1
    0 0 0 0 0 2
    1 1 1 0 1 0
    0 0 0 0 0 0
    0 1 1 1 1 1
    0 0 0 0 0 0
 */
public class boj17836 {
    static int n, m, t;
    static int [][] tower, dis;
    static int [][] ch;
    static int [] dx = {-1, 0, 1, 0}; // 용사가 가는 방향
    static int [] dy = {0, 1, 0, -1};

    public void DFS(int cnt, int n, int m, int t, int [][] tower){
        if(cnt <= t){

        }else{
            ch[1][1] = 1;
            for(int i=0; i<4; i++){
                int nx =
            }
        }
    }

    // 1. main 함수에서 입력 값 받기
    public static void main(String[] args) throws IOException {
        boj17836 T = new boj17836();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        tower = new int[n+1][m+1];
        dis = new int[n+1][m+1];
        ch = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++){
                tower[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        tower[1][1] = 0;
        tower[n][m] = 0;
        T.DFS(0, n, m, t, tower);

    }
}
