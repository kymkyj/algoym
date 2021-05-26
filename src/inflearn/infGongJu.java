package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 공주구하기
public class infGongJu {
    public static int solution(int n, int k){
        int answer = 1;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            for(int i=1; i<k; i++){
               queue.offer(queue.poll());
            }
            queue.poll();
            if(queue.size() == 1) answer = queue.poll();
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 왕자 수
        int k = Integer.parseInt(st.nextToken()); // 외치는 수
        System.out.println(solution(n, k));
    }
}
