package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 응급실
/*
    5 2                 3
    60 50 70 80 90
 */
public class infAmbulance {
    public static int solution(int n, int m, int [] person){
        int answer = 1; // 순서 카운트
        int onePerson = person[m];
        for(int i=0; i<n; i++){
            if(i == m) {
                return i;
            }
            if(person[i] >= onePerson) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 대기환자들
        int m = Integer.parseInt(st.nextToken()); // 지정환자
        int [] person = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            person[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, m, person));
    }
}
