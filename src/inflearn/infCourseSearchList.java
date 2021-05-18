package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 경로 탐색(인접리스트)
// 인접리스트 형태
// 정점이나 간선이 적으면 인접행렬로 해도되지만
// 1000개 10000개가 되면 메모리도 낭비되고 10000번이나 돌아야하기떄문에 인접행렬은 비효율
public class infCourseSearchList {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph; // Integer를 저장할 수 있는 어레이리스트를 저장할수 있는 어레이리스트
    static int[] ch;
    public void DFS(int v){
        if(v == n) answer++;
        else{
            // v번째 어레이리스트
            for(int nextv : graph.get(v)){ // graph.get(v) 하는거는 v번째의 ArrayList를 가리킴
                if(ch[nextv] == 0){
                    ch[nextv] = 1;
                    DFS(nextv); // 다음 정점 가리키는 것 체크
                    ch[nextv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        infCourseSearchList T = new infCourseSearchList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>()); // 1번부터 n번까지 정수를 저장할 수 있는 어레이 리스트 객체가 있어야한다!!
        }
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // get(a) 한거는 a번째 어레이리스트에 접근했다는 뜻
            // 거기에 add(b) b를 넣어줬다 라는 뜻
            graph.get(a).add(b);
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
