package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 폭발
/*
    mirkovC4nizCC44     mirkovniz
    C4
 */
public class boj9935 {
    static String str, bomb;
    public static String strBomb(String s1, String s2){
        return s1.replace(s2, "");
    }
    public static String solution(String str, String bomb){
        String answer = "";
        while(true){

        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        bomb = br.readLine();
        System.out.println(solution(str, bomb));
    }
}
