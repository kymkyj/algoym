package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 격자판 최대합
public class infGyukJaPan {
    public static int solution(int n, int [][] board) {
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int rowTmp = 0;
            int colTmp = 0;
            for(int j=0; j<n; j++){
                rowTmp += board[i][j]; // 행의 합
                colTmp += board[j][i]; // 열의 합
            }
            // 이렇게 하면 열의 합과 행의 합중 큰값이 answer에 들어감
            answer = Math.max(answer, rowTmp);
            answer = Math.max(answer, colTmp);
        }
        int crossTmp1 = 0;
        int crossTmp2 = 0;
        for(int i=0; i<n; i++){
            crossTmp1 += board[i][i];
            crossTmp2 += board[i][n-i-1];
        }
        answer = Math.max(answer, crossTmp1);
        answer = Math.max(answer, crossTmp2);

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] board = new int[n][n];
        StringTokenizer st = null;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(n, board));

    }
}
