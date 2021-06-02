package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 봉우리
public class infBongwoori {
    static int [] dx = {-1, 0, 1, 0}; // 동서남북 가리키는 x축
    static int [] dy = {0, 1, 0, -1}; // 동서남북 가리키는 y축

    public static int solution(int n, int [][] arr){
        int answer = 0; // 봉우리 갯수 카운트
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){ // 동서남북 4방향을 다 확인하기위해
                    int nx = i + dx[k];
                    int ny = j + dy[k];
//                    경계선을 아래 주석처럼 뒤에다가 처리하면 마찬가지로 동일한 index 바운드 에러가 난다.
//                    why? 비교하기 전에 경계선 체크를 먼저해야하기때문에
//                    if(arr[nx][ny] >= arr[i][j] && nx >= 0 && nx < n &&  ny >= 0 && ny < n){
                    if(nx >= 0 && nx < n &&  ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]){
                       flag = false;
                       break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        int [][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(n, arr));
    }
}
