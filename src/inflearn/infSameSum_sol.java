package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class infSameSum_sol {
    static String answer = "NO";
    static int n, total = 0; // total도 DFS에서 쓰기위해서 선언
    boolean flag = false; // YES가 발견되면 나머지는 할필요없어서 return 하기위해 선언
    public void DFS(int L, int sum, int [] arr){
        if(flag) return; // flag가 true로 넘어오게되면 YES이므로 나머지 재귀는 다 return해준다는 의미
        if(sum > total/2) return; // 32/2를 한 16을 넘어갔을 경우에는 그 뒤는 볼 필요가없다!!
        if(L == n){ // 부분집합이 완성됬을때
            if ((total - sum) == sum){
                answer = "YES";
                flag = true;
            }

        }else{
            DFS(L+1, sum+arr[L], arr); // sum을 부분집합에 포함하겠다.
            DFS(L+1, sum, arr); // sum을 부분집합에 포함하지 않겠다.
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            /*
                배열에 넣어줌과 동시에 total 합계를 구해주기위해 누적해서 더함
                다돌면 total = 32
             */
            total += arr[i];
        }
        infSameSum_sol T = new infSameSum_sol();
        T.DFS(0,0, arr);
        System.out.println(answer);
    }
}
