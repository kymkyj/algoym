package inflearn;

import java.io.IOException;
import java.util.Scanner;

public class infIslandDFS {
    static int answer, n;
    static int [][] island;
    static int [] dx = {-1, 0, 1, 0, -1, 1, 1, -1}; // 아일랜드 대각선까지 확인하기 위해..
    static int [] dy = {0, 1, 0, -1, -1, 1, -1, -1};
    public void DFS(int x, int y, int [][] island){
        for(int i=0; i<8; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && island[nx][ny] == 1){ // 1일때 육지로 뻗어나간다.
                island[nx][ny] = 0;
                DFS(nx, ny, island);
            }
        }
    }

    public void solution(int [][] island){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(island[i][j] == 1){ // 섬을 만난 것
                    answer++;
                    island[i][j] = 0; // 출발점을 0으로 바꿔놓고 넘어간다.
                    DFS(i, j, island); // 만나는 곳의 좌표를 넘겨줌
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        infIslandDFS T = new infIslandDFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        island = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; i<n; j++){
                island[i][j] = sc.nextInt();
            }
        }
        T.solution(island);
        System.out.println(answer);
    }
}
