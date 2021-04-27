package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class infBfs2_sol {
    int answer = 0;
    int [] dis={1, -1, 5};
    int [] ch;
    Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        //System.out.println(BFS(S, E));
        infBfs2_sol T = new infBfs2_sol();
        System.out.println(T.BFS(S, E));
    }

    public int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1; // 스위치해줄 변수
        Q.offer(s);
        int L = 0; // 루트노드는 0
        while(!Q.isEmpty()){
            int len = Q.size(); // len 1
            for(int i=0; i<len; i++){
                int x = Q.poll();
                for(int j=0; j<3; j++){
                    int nx = x + dis[j]; // 1레벨에서 3개의 노드가 생김
                    if(x == e) return L;
                    if (nx >= 1 && nx < 10001 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }
}
