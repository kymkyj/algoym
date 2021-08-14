package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 아스키 넘버로 대문자 65 ~ 90
// 아스키 넘버로 소문자 97 ~ 122

public class infStringConvert {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
            if(x >= 97 && x <= 122) answer+=(char)(x-32);
            else{
                answer+=(char)(x+32);
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        infStringConvert T = new infStringConvert();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
