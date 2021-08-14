package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class infConvertString {
    public ArrayList<String> solution(int n, String [] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        infConvertString T = new infConvertString();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = br.readLine();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }

    }
}
