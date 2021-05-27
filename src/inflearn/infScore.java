package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 점수 계산
//10
//1 0 1 1 1 0 0 1 1 0 --> 10
public class infScore {
    public static int solution(int n, int [] arr){
        int answer = 0;
        int tmp = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                tmp++;
                answer += tmp;
            }else{
                tmp = 0;
            }
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
        System.out.println(solution(n, arr));
    }
}
