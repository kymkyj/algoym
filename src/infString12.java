import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 암호
public class infString12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(Solution(N, s));
    }
    public static String Solution(int n, String str){
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            str = str.substring(7); // 바뀌어서 나오게끔 하기위해
        }

        return answer;
    }
}
