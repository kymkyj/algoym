package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class infString2 {
    public static String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
           // 아스키코드 방법 내가 생각한 것
            if(x>= 65 && x <= 90){
                answer += (char)(x + 32);
            }else{
                answer += (char)(x - 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
