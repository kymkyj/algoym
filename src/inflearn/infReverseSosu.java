package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 뒤집은 소수
public class infReverseSosu{
    public static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<num; i++){ // 2부터 자기자신까지해서
            if(num % i == 0) return false; // 약수가 존재하게되면 소수가 아니다!
        }
        return true;
    }
    public static ArrayList<Integer> solution(int n, int [] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
             int tmp = arr[i];
             int res = 0;
            // 여기부분 생각해내는게 어렵다..
            // 다른방법으로도 할수 있을듯
             while(tmp > 0){
                 int t=tmp % 10;
                 res = res * 10 + t;
                 tmp = tmp/10;
             }
             if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i : solution(n, arr)){
            System.out.print(i + " ");
        }
    }
}
