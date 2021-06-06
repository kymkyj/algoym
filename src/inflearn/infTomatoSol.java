package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class tomatoPoint{
    public int x, y;
    tomatoPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class infTomatoSol {
    static int m, n;
    static int answer = 0; // 일수 저장할 변수
    static int [] dx = {-1, 0, 1, 0}; // 토마토 왼쪽 오른쪽 앞 뒤
    static int [] dy = {0, 1, 0, -1};
    static int [][] tomato, dis;
    static Queue<tomatoPoint> Q = new LinkedList<>();

    public void BFS(){
        while(!Q.isEmpty()){
            tomatoPoint tmp = Q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >=0 && nx <n && ny >= 0 && ny<m && tomato[nx][ny] == 0){
                    tomato[nx][ny] = 1;
                    Q.offer(new tomatoPoint(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        infTomatoSol T = new infTomatoSol();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        tomato = new int[n][m];
        dis = new int[n][m];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                tomato[i][j] = Integer.parseInt(st.nextToken());
                // 시작지점을 확인해서 1인경우 판단되면
                // 미리 큐에 넣어놓는다.
                if(tomato[i][j]==1) Q.offer(new tomatoPoint(i, j));
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(tomato[i][j] == 0) flag = false;
            }
        }
        if(flag){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
}
