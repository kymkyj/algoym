package inflearn;

import java.util.*;

public class infString1_sol {
    public static int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t); // t라는 문자를 대문자로 바꿔주세요!
        for(char x : str.toCharArray()) { // 향상된 for문에서 이자리는 배열 또는 컬렉션 프레임워크 종류들만 온다.
            if(x == t){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //inflearn.infString1_sol T = new inflearn.infString1_sol();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(solution(str, c));
    }
}
