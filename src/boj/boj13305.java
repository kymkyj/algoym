package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소
/*
    4          ->       18
    2 3 1
    5 2 4 1
 */
// 주유소끼리 앞뒤 비교
// 전 주유소가 후 주유소보다 클 경우 필요한 리터만큼만 충전
// 그게 아니라면 남은 수만큼 다 충전
public class boj13305 {
    static int meterSum = 0; // 총 가야할 거리
    static int[] gas, meter;
    public static int solution(int n, int [] gas){
        int answer = 0;

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 주유소 갯수
        StringTokenizer st = new StringTokenizer(br.readLine());
        meter = new int[n-1];
        gas = new int[n];
        for(int i=0; i<n-1; i++){

        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            gas[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, gas));
    }
}
