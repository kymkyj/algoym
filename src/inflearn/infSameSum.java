package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 합이 같은 부분집합
// {1,3,5,6,7,10}
// 중간에 로직을 어떻게 짜야할지 헷갈린다..
public class infSameSum {
    static int n;
    static int [] arrays;
    static int [] ch; // 체크하는 변수
    public void DFS(int L, int sum){
        if(L == arrays.length - 1){ // 배열의 크기 6보다 1작은 값까지
            for(int i=0; i<n; i++){
                if(ch[i] == 1) sum += ch[i];
            } // tmp = 32

        }else{
            ch[L] = 1;
            DFS(L+1, sum);
            ch[L] = 0;
            DFS(L+1, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arrays[i] = Integer.parseInt(st.nextToken());
        }
        infSameSum T = new infSameSum();
        T.DFS(arrays[0], 0);
    }
}
