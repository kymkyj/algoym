package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 구간 합 구하기 5
/*
    4 3         ->  27 6 64
    1 2 3 4
    2 3 4 5
    3 4 5 6
    4 5 6 7
    2 2 3 4
    3 4 3 4
    1 1 4 4
 */
class Gugan {
    public int x, y;
    Gugan(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class boj11660 {
    static int n, m;
    static int [][] board;
    static ArrayList<Gugan> list = new ArrayList<>();
    public static int solution(){
        int answer = 0;
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int [n+1][n+1];
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++){
                int tmpX = Integer.parseInt(st.nextToken());
                int tmpY = Integer.parseInt(st.nextToken());
                System.out.println(tmpX + ' ' + tmpY);
//                list.add(new Gugan(tmpX, tmpY));
            }
        }
    }
}
