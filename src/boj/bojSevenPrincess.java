package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 소문난 칠공주
/*
    문제분석 : 이다솜파 vs 임도연파
    1. 7명으로 구성되어야 한다.
    2. 가로나 세로로 인접해 있어야 한다.
    3. 이다솜파의 학생들로만 구성되지 않아도 되지만 적어도 4명이상은 이다솜파여야 한다.
    4. 모든 경우의 수를 구한다.
    5. S 이다솜파, Y 임도연파

    입력 값                출력 값
    YYYYY                   2
    SYSYS
    YYYYY
    YSYYS
    YYYYY
 */
// 모든 경우의 수이기때문에 DFS로 탐색해야 할것 같다.
public class bojSevenPrincess {
    static char [][] map;
    static boolean [][] ch; // 체크
    static int answer;
    static int [] dx = {-1, 0, 1, 0};
    static int [] dy = {0, 1, 0, -1};

    public void DFS(int L, int x, int y, int ycnt,  char [][] map){
        if(L == 7 && ycnt < 4) answer++;
        else{
            for(int i=0; i<4; i++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;
            }
        }
    }

    // 입력 값 받기
    public static void main(String[] args) throws IOException {
        bojSevenPrincess T = new bojSevenPrincess();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new char[5][5];
        ch = new boolean[5][5];
        for(int i=0; i<5; i++){
            String input = br.readLine();
            for(int j=0; j<5; j++){
                map[i][j] = input.charAt(j);
            }
        }
        T.DFS(1,0, 0, 0, map);
    }
}
