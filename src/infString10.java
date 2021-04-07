import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 가장 짧은 문자거리
public class infString10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        String s = st.nextToken();
        char t = st.nextToken().charAt(0);
        for(int x : Solution(s, t)){
            System.out.print(x+ " ");
        }
    }
    public static int [] Solution(String s, char t){
        int [] result = new int[s.length()];
        int count = 1000;
        char [] c = s.toCharArray();

        for(int i=0; i<c.length; i++){
            if(c[i] == t){
                count = 0;
                result[i] = count;
            }else{
                count++;
                result[i] = count;
            }
        }
        count = 1000;
        for(int i=c.length-1; i>=0; i--){
            if(c[i] == t) count = 0;
            else {
                count++;
                result[i] = Math.min(result[i], count);
            }

        }
        return result;
    }
}
