package boj;/*
    8 8
    WBWBWBWB
    BWBWBWBW
    WBWBWBWB
    BWBBBWBW
    WBWBWBWB
    BWBWBWBW
    WBWBWBWB
    BWBWBWBW

    10 13
    BBBBBBBBWBWBW
    BBBBBBBBBWBWB
    BBBBBBBBWBWBW
    BBBBBBBBBWBWB
    BBBBBBBBWBWBW
    BBBBBBBBBWBWB
    BBBBBBBBWBWBW
    BBBBBBBBBWBWB
    WWWWWWWWWWBWB
    WWWWWWWWWWBWB

 */


import java.util.Scanner;

public class boj1018 {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new boolean[N][M];

        sc.nextLine();

        int N_row = N - 7;
        int M_col = M - 7;

        for(int i=0; i<N_row; i++){
            for(int j = 0; j<M_col; j++){
                find(i,j);
            }
        }
        System.out.println(min);

    }

    public static void find(int x, int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean tf = arr[x][y]; // 첫 번째 칸의 색

        for(int i=x; i<end_x; i++){
            for(int j = y; j < end_y; j++){

                // 올바른 색이 아닐경우 count 1증가
                if(arr[i][j] != tf){
                    count++;
                }
                // 다음칸은 색이 바뀌므로, true라면 false로, false라면 true로
                tf = (!tf);
            }
            tf = !tf;
        }

        /*
            첫 번째 칸을 기준으로 할 때의 색칠 할 갯수(count)와
            첫 번째 칸의 색의 반대되는 색을 기준으로 할 떄의
            색칠 할 갯수(64 - count) 중 최솟값을 count에 저장
         */
        count = Math.min(count, 64 - count);

        /*
            이전까지의 경우 중 최솟값보다 현재 count값이
            더 작을 경우 최솟값을 갱신
         */
        min = Math.min(min, count);
    }

}
