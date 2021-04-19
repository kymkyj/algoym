package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 압축
public class infString11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(Solution(s));
    }
    public static String Solution(String str){
        StringBuilder sb = new StringBuilder();
        int cnt = 1; // 카운트 해줄 변수
        str = str + " "; // 마지막에 비교해줄 문자가 없으므로 공백을 넣어줌 안그러면 index out of 에러남
        String answer = "";
        for(int i=0; i<str.length()-1; i++){ // i가 마지막까지 가면 안되서 length()에 -1을 해준다.
            if(str.charAt(i) == str.charAt(i+1)){ // K랑 K랑 같냐?
                cnt++;
                continue;
            }else{ // 같지 않을 경우에
                if(cnt > 1){ // 카운트한게 1보다 크면
                    answer += str.charAt(i) + Integer.toString(cnt);
                    cnt = 1;
                }else{
                    answer += str.charAt(i);
                    cnt = 1;
                }
            }
        }
        return answer;
    }
}
