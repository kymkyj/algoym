package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 조합구하기
// 조합은 외워두는게 좋다
public class infCombi {
    static int n, m;
    static int [] combi;
    public void DFS(int L, int s){
        if(L==m){ // 레벨이 m개가 되면 조합이 완성됬다는 뜻
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i=s; i<=n; i++){
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        combi = new int[m];
        infCombi T = new infCombi();
        T.DFS(0, 1); // 레벨과 스타트 번호

    }
}
