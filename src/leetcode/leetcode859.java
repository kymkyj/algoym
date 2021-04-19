package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BuddyString
public class leetcode859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aStr = br.readLine();
        String bStr = br.readLine();
        System.out.println(buddyStrings(aStr, bStr));
    }
    public static boolean buddyStrings(String a, String b) {
        boolean answer = false;
        char[] ac = a.toCharArray();
        int lt = 0;
        int rt = a.length() -1;
        while(lt < rt){
            char tmp = ac[lt];
            ac[lt] = ac[rt];
            ac[rt] = tmp;
            String result = String.valueOf(ac);
            if(result.equals(b)){
                answer = true;
            }else{
                char tmp2 = ac[lt];
                ac[lt] = ac[rt];
                ac[rt] = tmp2;
                lt++;
            }
        }
        return answer;
    }
}
