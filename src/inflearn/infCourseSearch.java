package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 경로탐색(DFS)
// 인접행렬로 푼 방식
// 그래프에서는 한번 방문한 노드는 방문하는 것이 아니다!
public class infCourseSearch {
    static int n, m, answer=0; // 전역변수 static -> main에서도 입력받고 해야하기때문에
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){ // v는 1로시작
        if (v == n) answer++;
        else{
            for(int i=1; i<=n; i++){ // 정점번호
                if(graph[v][i] == 1 && ch[i]==0){ // v에서 i로 이동하는 모든경우 구하기 단 체크가 안되어있는 곳만!
                    ch[i] = 1; // 이동하고 체크해준다
                    DFS(i); // v에서 i로 이동하는 것이라서 i로 적어줘야한다.
                    ch[i]=0; // 호출을 위해서 하면 체크되고 여기선 반대로 돌아가는 경우로 체크 해제
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        infCourseSearch T = new infCourseSearch();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n+1][n+1]; // 1번 인덱스부터 N번 인덱스까지 해야함으로!
        ch = new int[n+1]; // 체크배열 방문 여부 파악하기 위함
        for(int i=0; i<m; i++){ // 간선갯수만큼 돌면서 생성
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
        }
        ch[1] = 1; // 1번노드 체크걸고 시작
        T.DFS(1);
        System.out.println(answer);
    }
}
