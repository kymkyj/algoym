import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class infString9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(Solution(s));
    }
    public static int Solution(String str){
        int answer = 0;
        str = str.replaceAll("[^0-9]","");
//        answer = Integer.valueOf(str);
        answer = Integer.parseInt(str);

        return answer;
    }
}
