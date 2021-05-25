package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 동전교환
// BFS로도 풀수 있을꺼 같은데?
public class infCoinChange {
    static int n, m, answer = Integer.MAX_VALUE;
    public void DFS(int L, int sum, Integer [] arr){
        if(sum > m) return;
        if(L >= answer) return;
        if(sum == m){
            answer=Math.min(answer, L);
        }else{
            for(int i=0; i<n; i++){
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer [] arr = new Integer[n]; // Colletions를 사용하려면 int가 아니라 Integer(객체형)으로 변경해줘야함
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        /*
            내림차순을 해줘야 타임아웃 에러가 안남
            사유 : 큰 동전을 먼저 경우의 수를 따져서 하면 나머지의 경우는 안봐도 되기 떄문에
         */
        Arrays.sort(arr, Collections.reverseOrder());
        m = Integer.parseInt(br.readLine());
        infCoinChange T = new infCoinChange();
        T.DFS(0, 0, arr);
        System.out.println(answer);

    }
}
