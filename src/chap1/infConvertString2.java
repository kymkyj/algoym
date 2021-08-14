package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 특정 문자만 뒤집기
public class infConvertString2 {
    public String solution(String str){
        String answer;
        char [] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1 ;
        while(lt < rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        infConvertString2 T = new infConvertString2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
