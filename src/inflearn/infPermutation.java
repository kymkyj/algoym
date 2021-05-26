package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 순열 구하기
public class infPermutation {
    static int n, m;
    static int [] ch, arr, permu;

    public void DFS(int L){
        if(L == m){ // 끝까지 다 돈거니까
            for(int x : permu) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i=0; i<n; i++){
                if(ch[i] == 0) { // 체크되지않은 곳만 가기위해
                    ch[i] = 1; // 체크하고
                    permu[L] = arr[i]; // 여기 처음 온순간 permu = {3, ?} 이렇게 3채워짐
                    DFS(L + 1); // L이 1로 증가
                    ch[i] = 0; // 되돌아갈때 체크된거를 풀어줘야한다. 그래야 추가사용가능
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        infPermutation T = new infPermutation();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 자연수 갯수
        m = Integer.parseInt(st.nextToken()); // 쌍을 이루는 갯수
        arr = new int[n];
        ch = new int[n];
        permu = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        T.DFS(0);
    }
}
