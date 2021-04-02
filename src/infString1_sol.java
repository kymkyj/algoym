import java.util.*;

public class infString1_sol {
    public static int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t); // t라는 문자를 대문자로 바꿔주세요!
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == t) answer++;

        }
        return answer;
    }

    public static void main(String[] args) {
        //infString1_sol T = new infString1_sol();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(solution(str, c));
    }
}
