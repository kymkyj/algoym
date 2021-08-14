package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class infStringLanguage {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            if(str.length() > m) answer = str; // 마지막 단어 처리 substring 에서 중요
            str = str.substring(pos+1);
        }
//        String [] s = str.split(" ");
//        for(String x : s){
//            int len = x.length();
//            if(len > m){
//                m = len;
//                answer = x;
//            }
//        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        infStringLanguage T = new infStringLanguage();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
