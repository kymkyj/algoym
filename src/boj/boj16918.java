package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 봄버맨
/*
    설명
    1. 봄버맨은 R * C 격자판에 위치
    2. 폭탄이 있는 칸은 3초뒤 폭발함
    3. 폭발하면 폭탄칸과 인접한 네방향의 칸이 파괴됨 (i, j)인 경우에 (i+1, j), (i-1, j), (i, j+1), (i, j-1)
    4. 봄버맨은 처음 1초에 임의의 칸에 폭탄 설치 -> 다음 1초 아무것도 안함 -> 그다음 1초에 폭탄 설치 안된곳 다 폭탄 설치
    5. 그 다음부터는 폭탄 설치 안된곳 설치 -> 폭파 반복
    6. 첫줄에 R, C, N 주어짐 / 빈칸 . 폭탄 0

    6 7 3          ->           OOO.OOO
    .......                     OO...OO
    ...O...                     OOO...O
    ....O..                     ..OO.OO
    .......                     ...OOOO
    OO.....                     ...OOOO
    OO.....

    왠지 역할별로 나눠야할듯
    1단계 - 처음 격자판 상태 board에 저장
    2단계 - 멍떄리기
    3단계 - 남은칸 다 폭탄 설치
    4단계 - 폭탄 펑
    5단계 - 격자판 상태확인 result가 필요할 듯?
 */
class BombPos{ // 폭탄 위치 지정해주기위한 클래스 선언
    public int x, y;
    BombPos(int x, int y){
        this.x = x;
        this.y = y;
    }
}

// 1 - 처음 격자판 상태 만들기
public class boj16918 {
    static int R, C, N; // N이 폭탄 카운트
    static char[][] board; // 격자판
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<BombPos> Q = new LinkedList<>(); // 처음 폭탄위치 넣어주기 위해

    public void BFS(){

    }

    public static void solution(){

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        board = new char[R][C];
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i=0; i<R; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<C; j++){
                char tmp = st.nextToken().charAt(j);
                if(tmp == '0') Q.offer(new BombPos(i, j));
                board[i][j] = tmp;
            }
        }
    }
}