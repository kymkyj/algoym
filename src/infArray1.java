import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 큰수 출력하기
public class infArray1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int [N];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int x : Solution(N, arr)){
            System.out.print(x+ " ");
        }
    }
    public static ArrayList<Integer> Solution(int N, int [] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<N; i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
}
