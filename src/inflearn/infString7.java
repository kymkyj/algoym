package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 회문 문자열
public class infString7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(Solution(str));
    }
    public static String Solution(String str){
        String answer = "NO";
        StringBuilder s = new StringBuilder();
        s.append(str.toUpperCase());
        //if(str.toUpperCase().equals(s.reverse().toString())){
        if(str.equalsIgnoreCase(s.reverse().toString())){
            answer = "YES";
        }
        return answer;
    }
}
