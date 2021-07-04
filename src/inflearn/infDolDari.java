package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 돌다리 건너기
public class infDolDari {
    static int dy [];
    public static int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n+1; i++){
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n+1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dy = new int[n+2];
        System.out.println(solution(n));

    }
}
