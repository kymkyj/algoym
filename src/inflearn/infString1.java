package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자찾기
public class infString1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().toLowerCase();
        char str2 = br.readLine().toLowerCase().charAt(0);
        int count = 0; // 문자 찾으면 카운트

        char [] charStr = str1.toCharArray();
        for(int i=0; i<charStr.length; i++){
            if(charStr[i] == str2){
                count++;
            }
        }
        System.out.println(count);
    }
}
