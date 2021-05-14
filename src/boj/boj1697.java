package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 숨바꼭질
public class boj1697 {
   static int n, k;
   static int [] ch; // 들린지 체크하기위해
   static int [] dis;
     public void BFS(int n){
        int L = 0; // 노드 레벨증가 값
        ch = new int[10001]; // 걍 큰값잡기
        dis = new int[3];
        ch[n] = 1; // 5번위치(수빈위치) 들렸다고 1찍기
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n); // 수빈위치 지정
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                int x = queue.poll();
                if(x == k) System.out.println(L);
                else {
                    for (int j = 0; j < 3; j++) {
                        int nx = 0;
                        if (j == 0) {
                            dis[j] = nx + 1;
                        } else if (j == 1) {
                            dis[j] = nx - 1;
                        } else {
                            dis[j] = nx * 2;
                        }
                    }
                }
            }
            L++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 수빈위치
        int k = Integer.parseInt(st.nextToken()); // 동생위치
        boj1697 T = new boj1697();
        T.BFS(n);
    }
}
