package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 격자판 미로
public class infMiroDfs {
    /*
        9시, 12시, 3시, 6시 순서
        ex) x가 -1이고 y가 0이면 (-1,0) 9시방향 가르킴
     */
    static int [] dx = {-1, 0, 1, 0};
    static int [] dy = {0, 1, 0, -1};
    static int [][] board; // 미로 정보 담고있는 배열
//    static int [][] ch; // 움직일 거리 측정
    static int answer =0;

    public void DFS(int x, int y){
        if(x==7 && y==7) answer++; // 이러면 종착에 온것
        else{
            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                // 이렇게 잡아야 경계선 안쪽으로 우리가 갈 수 있는곳만 체크
                // board[nx][ny] 는 갈수있는지 여부 판단 -> 0이여야지만 통로
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0){
                    board[nx][ny] = 1; // 간곳은 벽을 만든다
                    DFS(nx, ny);
                    board[nx][ny] = 0; // 통로로 다시 풀어줘야한다 back 할 때
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[8][8]; // 7 * 7의 크기로 2차원배열 만들어준다.
        for(int i=1; i<=7; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=7; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        infMiroDfs T = new infMiroDfs();
        board[1][1] = 1; // 출발점 체크 걸어준다.
        T.DFS(1,1);
        System.out.println(answer);
    }
}
