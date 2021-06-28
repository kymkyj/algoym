package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

// 단지번호 붙이기
/*
    7        ->   3 7 8 9
    0110100
    0110101
    1110101
    0000111
    0100000
    0111110
    0111000

 */
public class boj1667 {
    static int n, totalCnt, dangiCnt;
    static int [] dx = {-1, 0, 1, 0};
    static int [] dy = {0, 1, 0, -1};
    static int [][] dangi, ch;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void DFS(int x, int y){
        ch[x][y] = 1; // 간 단지 체크
        if(x == n && y == n) totalCnt++;
        else{
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y+ dy[i];
                if(nx >= 0 && nx <= n && ny >=0 && ny <= n && dangi[nx][ny] == 1){
                    if(ch[x][y] != 1){
                        ch[nx][ny] = 1;
                        dangiCnt++;
                        DFS(nx, ny);
                        ch[nx][ny] = 0;
                    }
                }
            }
            list.add(dangiCnt);
        }
    }

    public static void main(String[] args) throws IOException {
        boj1667 T = new boj1667();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dangi = new int[n][n];
        ch = new int[n][n];
        for(int i=0; i<n; i++){
            String tmp = br.readLine();
            for(int j=0; i<n; j++){
                dangi[i][j] = tmp.charAt(j) - '0';
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(dangi[i][j] == 1 && ch[i][j] != 1){
                    dangiCnt++;
                    DFS(i,j);
                }
            }
        }
    }
}
