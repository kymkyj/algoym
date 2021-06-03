package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로의 최단거리 통로
class Point{ // 좌표를 넣기 위해서 클래스를 만듦
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class infMiroShort {
    static int [][] board, dis;
    static int [] dx = {-1, 0, 1, 0}; // 동서남북 x축
    static int [] dy = {0, 1, 0, -1}; // 동서남북 y축

    public void BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y)); // 좌표 객체를 큐에 넣어준다.
        board[x][y] = 1;
        while(!q.isEmpty()){
            Point tmp = q.poll(); // 좌표를 꺼낸다.
            for(int i=0; i<4; i++){ // 동서남북 4방향
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx >= 1 && nx <= 7 && ny >=1 && ny <= 7 && board[nx][ny] == 0){ // 경계선 안에서 미로에서 체크안된부분 가는 것
                    board[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        infMiroShort T = new infMiroShort();
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
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
