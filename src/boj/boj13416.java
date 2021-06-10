package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 주식투자
/*
    2
    4
    500 800 200
    300 0 300
    -100 -200 -400
    600 200 300
    3
    451 234 309
    224 334 467
    143 246 245
 */
public class boj13416 {
    public static int solution(){
        int answer = 0;

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int jusic [][] = new int[3][N];
            for(int j=0; j<3; j++){
                for(int k=0; k<N; k++){
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    jusic[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            for(int j=0; j<3; j++){
                for(int k=0; k<N; k++){
                    System.out.print(jusic[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
