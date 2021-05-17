package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소수(에라스토테네스의 체)
public class infSosu {
    public static int solution(int n){
        int answer = 0;
        int [] ch = new int[n+1];
        for(int i = 2; i<=n; i++){
            if(ch[i] == 0){
                answer++;
                for(int j=i; j<=n; j=j+i) // j가 i의 배수만큼 돌아야하니까 j+i
                    ch[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }
}
