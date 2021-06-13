package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 섬나라 아일랜드
class islandPoint{
    public int x, y;
    islandPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}
/*
    7                   5
    1 1 0 0 0 1 0
    0 1 1 0 1 1 0
    0 1 0 0 0 0 0
    0 0 0 1 0 1 1
    1 1 0 1 1 0 0
    1 0 0 0 1 0 0
    1 0 1 0 1 0 0
 */
public class infIsland {
    static int n;
    static int answer = 0; // 섬 갯수
    static int [][] island, dis;
    static int [] dx = {-1, 0, 1, 0, -1, 1, 1, -1}; // 아일랜드 대각선까지 확인하기 위해..
    static int [] dy = {0, 1, 0, -1, -1, 1, -1, -1};

    public void BFS(int x, int y, int [][] island){
        Queue<islandPoint> Q = new LinkedList<>();
        Q.offer(new islandPoint(x, y));
        dis[x][y] = 1;
        while(!Q.isEmpty()){
            islandPoint tmp = Q.poll(); // (1,1) 나옴
            for(int i=0; i<8; i++){
                int nx = tmp.x+dx[i]; // x축
                int ny = tmp.y+dy[i]; // y축
                if(nx >= 1 && nx <=7 && ny >= 1 && ny <= 7 && island[nx][ny]==1){
                    island[nx][ny] =0;
                    Q.offer(new islandPoint(nx, ny));
                }
            }
        }
    }
    public void solution(int [][] island){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(island[i][j] == 1){
                    island[i][j] = 0;
                    BFS(i, j, island);
                    answer++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        infIsland T = new infIsland();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        island = new int[n+1][n+1];
        dis = new int[n+1][n+1];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; i<n; j++){
                island[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        T.solution(island);
        System.out.println(answer);
    }
}
