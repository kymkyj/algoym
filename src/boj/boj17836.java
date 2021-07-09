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
// DFS -- 특정 목적지까지 가야하는 경우
// BFS -- 전체에서 영역을 구해야 할 경우
public class boj17836 {
    static int n, m, t, answer;
    static int min = Integer.MAX_VALUE;
    static int [][] tower;
    static int [][] ch; // 지나가면서 마법벽으로 바꿔주는 체크
    static int [] dx = {-1, 0, 1, 0}; // 용사가 가는 방향
    static int [] dy = {0, 1, 0, -1};

    // 용사가 상하좌우로 이동하는 로직
    // 용사가 공주한테까지 가는 거리
    public void DFS(int x, int y, int cnt){
        tower[x][y] = 1;
        //if(cnt <= t){

        if(x == n && y == m) {
            return;
        }else{
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx > 1 && nx <= n && ny > 1 && ny <= m && tower[nx][ny] == 0){
                    tower[nx][ny] = 1;
                    cnt++;
                    DFS(nx, ny, cnt);
                    tower[nx][ny] = 0;
                }
            }
        }
        answer = cnt;
    }
    // 용사가 검까지 간 DFS + 검 공주한테까지 가는 DFS

    // 과정
    // 시행착오
    // 내가 이렇게 가는 데 이부분이 고민이고 어렵다.


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
        ch = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++){
                tower[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        tower[1][1] = 0;
        tower[n][m] = 0;
        // 1번인 경우 바로 DFS 함수 호출
        // 목적지가 정해져있으면 바로 DFS로 보내줘도 되는 경우임
        T.DFS(1,1, 0);
        System.out.println(answer);

        // 출발지 및 목적지가 분명하지 않을 떄 -- ex) 안전영역
        // 2번 입력값이 들어있는 2차원배열이 있는데 이거를 탐색하면서 DFS를 보내줘야하는 경우
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                if(tower[i][j] == 1){
//                    T.DFS()
//                }
//            }
//        }
    }
}
