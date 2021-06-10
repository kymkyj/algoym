package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int jusic [][] = new int[N][3];
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=0; k<3; k++){
                    jusic[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            int index = 0;
            int sum = 0;
            while(index <= 3){
                int max = Integer.MIN_VALUE;
                for(int j=0; j<N; j++){
                    if(max < jusic[j][index]){
                        max = jusic[j][index];
                    }
                }
                sum += max;
                index++;
            }
            list.add(sum);

            for(int k : list){
                System.out.println(k);
            }
        }
    }
}
