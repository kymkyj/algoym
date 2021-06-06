package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로의 최단거리 통로
class checkPoint{ // 좌표를 넣기 위해서 클래스를 만듦
    public int x, y;
    checkPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class infMiroShort2 {
    static int [][] board, dis;
    static int [] dx = {-1, 0, 1, 0}; // 동서남북 x축
    static int [] dy = {0, 1, 0, -1}; // 동서남북 y축

    public void BFS(int x, int y){
        Queue<checkPoint> Q = new LinkedList<>();
        Q.offer(new checkPoint(x, y));
        board[x][y] = 1;
        while(!Q.isEmpty()){
            checkPoint tmp = Q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx >= 1 && nx <=7 && ny >= 1 && ny <= 7 && board[nx][ny]==0){
                    board[nx][ny] =1;
                    Q.offer(new checkPoint(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;

                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        infMiroShort2 T = new infMiroShort2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[8][8];
        dis = new int[8][8];
        for(int i=1; i<=7; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=7; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        T.BFS(1,1);
        // 막혀서 못가는 경우 도착지점은 말그대로 0,0 상태로 남아있게 된다.
        // 그래서 7,7 지점에 들렸는지 확인만 하면 됨으로 = 0으로 확인한다.
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
