import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class infString8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(Solution(str));
    }
    public static String Solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        // replace vs replaceAll
        // replace는 첫번째 인자에 찾을 문자열이 옴 replaceAll는 첫번째 인자에 정규식이 옴
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) return "YES";

        return answer;
    }
}
