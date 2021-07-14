package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대부분 증가수열
public class infDpLIS {
    static int [] dy;
    public static int solution(int [] arr){
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1; // 직관적으로 알수 있는 값이므로 초기화
        for(int i=1; i<arr.length; i++){
            int max = 0; // 0으로 해주는 이유는 자기 자신보다 앞에 큰게 하나도 없을 경우 자기 자신의 길이인 1을 찍어주기 위해
            for(int j= i-1; j>=0; j--){
                if(arr[j] < arr[i] && dy[j] > max) max=dy[j];
            }
            dy[i] = max + 1; // i번째 항은 j번째 항 뒤에 바로 추가되기 떄문에 +1
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));

    }
}
