package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

// 최대점수 구하기
/*
    입력예시
    5 20
    10 5
    25 12
    15 8
    6 3
    7 4
 */
public class infMaxScore {
    static int n, m;
    static int [] score;
    static int [] times;
    static int max = Integer.MIN_VALUE;
    public void DFS(int L, int score, int times, int [] scoreArr, int [] timesArr){
        if(L == n){ // n크기와 같아지면 모든 트리 다 뻗었을 때
            if(times > m) return;
            else { // times가 m보다 작거나 같은 경우
                int tmp = score;
                if(tmp > max) max = tmp;
            }
        }else{ // 그렇지 않은 경우
            DFS(L+1, score + scoreArr[L], times + timesArr[L], scoreArr, timesArr);
            DFS(L+1, score, times, scoreArr, timesArr);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        score = new int[n]; // 점수를 담을 배열
        times = new int[n]; // 걸린 시간을 담을 배열
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            score[i] = Integer.parseInt(st.nextToken());
            times[i] = Integer.parseInt(st.nextToken());
        }
        infMaxScore T = new infMaxScore();
        T.DFS(0, 0, 0, score, times);
        System.out.println(max);
    }
}
