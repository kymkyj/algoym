package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 송아지 찾기(BFS)
public class infSongag {
    public static int BFS(int S, int E){
        // 한번의 점프로 뒤로1칸 (-1), 앞으로 1칸(+1), 앞으로 5칸(+5)
        Queue<Integer> q = new LinkedList<>();
        int L = 0; // 레벨을 뜻함
        boolean check = false; // 들렸던 곳인지 아닌지 체크변수
        q.offer(S);
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int cur = q.poll(); // 현재 위치 꺼내서 담고
//                System.out.print(cur+ " ");
                if(S == E){
                    break;
                }else{
                    int firstJump1 = S+1;
                    int backJump1 = S-1;
                    int firstJump5 = S+5;
                    if(firstJump1 != E) q.offer(firstJump1);
                    if(backJump1 != E) q.offer(backJump1);
                    if(firstJump5 != E) q.offer(firstJump5);
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        System.out.println(BFS(S, E));
        //BFS(S, E);
    }
}
