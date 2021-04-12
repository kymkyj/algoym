import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 보이는 학생
public class infArray2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Solution(N, arr));

    }
    public static int Solution(int N, int [] arr){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(arr[0]); // 첫번째는 무조건 보이니까
        int max = arr[0];
        for(int i=1; i<N; i++){
            if(arr[i] > max){
                answer.add(arr[i]);
                max = arr[i];
            }
        }
        return answer.size();
    }
}
