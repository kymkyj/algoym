package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 바둑이 승차
public class infDangDange {
    static int sum = 0; // 누적더할 변수
    static int c, n;
    static int max = Integer.MIN_VALUE;
    public void DFS(int L, int sum, int [] arr){
        if(L == n){
            if(sum > c) return; // 바둑이 무게합이 c보다 크면안됨으로 return;
            else{
                int tmp = sum;
                if(tmp > max) max = tmp;
            }
        }else{
            DFS(L+1, sum+arr[L], arr); // 누적합계를 포함하겠다라는 뜻
            DFS(L+1, sum, arr); // 합계를 포함하지 않겠다라는 뜻
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        infDangDange T = new infDangDange();
        T.DFS(0, 0, arr);
        System.out.println(max);
    }
}
