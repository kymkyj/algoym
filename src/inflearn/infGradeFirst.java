package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 등수 구하기
public class infGradeFirst {
    public static int [] solution(int n, int [] grade){
        int [] answer = new int[n];
        for(int i=0; i<n; i++){
            answer[i] = 1;
            for(int j=0; j<n; j++){
                if(grade[i] < grade[j]) answer[i]++;
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
        for(int i : solution(n, arr)){
            System.out.print(i + " ");
        }
    }
}
