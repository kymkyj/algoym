package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 피자배달
/*
    4 4         ->  6
    0 1 2 0
    1 0 2 1
    0 2 1 2
    2 0 1 2
 */
class PizzaDis{
    public int x, y;
    PizzaDis(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class infPizzaDelivery {
    static int n, m;
    static int [][] board;
    static PizzaDis [][] dis;
    static boolean [][] ch;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1}; // 전방향 다봐야할듯?
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};

    // 입력값을 받아서 board에 넣어준다.
    // 현재상태 : board값에 입력값 채워져있는 상태
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n+1][n+1];
        ch = new boolean[n+1][n+1];
        dis = new PizzaDis[n+1][n+1];
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                if(board[i][j] == 1) dis[i][j] = new PizzaDis(i, j);
                    board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(board[i][j] == 1){

                }
            }
        }

    }
}
