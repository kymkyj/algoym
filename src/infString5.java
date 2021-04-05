import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 특정문자 뒤집기
public class infString5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(Solution(str));
    }
    public static String Solution(String str){
        char [] c = str.toCharArray();
        int lt = 0;
        int rt = str.length() -1;
            while(lt < rt){
                if(!Character.isAlphabetic(c[lt])) lt++;
                else if(!Character.isAlphabetic(c[rt])) rt--;
                else{
                    char tmp = c[lt];
                    c[lt] = c[rt];
                    c[rt] = tmp;
                    lt++;
                    rt--;
                }
            }
        String answer= String.valueOf(c);
        return answer;
    }
}
