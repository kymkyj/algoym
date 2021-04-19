package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 단어 뒤집기
public class infString4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String [] str = new String[N];
        for(int i=0; i<N; i++){
            str[i] = br.readLine();
        }
        for(String x : Solution(N, str)){
            System.out.println(x);
        }
    }

    public static ArrayList<String> Solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
}
