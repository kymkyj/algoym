package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 크레인 인형뽑기(카카오)
public class infDollsPick {
    public static int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){ // 크레인의 위치만큼 반복
            for(int i=0; i<board.length; i++){ // 이렇게 쓰면 행길이를 말함
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer += 2;
                        stack.pop();
                    }
                    // 한번 로직처리하고나서는 다음아래에 있는 인형을 또 찾으면 안되니 for문을 종료한다.
                    else stack.push(tmp);
                    break;
                }
            }
        }

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
        int m = Integer.parseInt(br.readLine());
        int [] moves = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            moves[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(board, moves));
    }
}
