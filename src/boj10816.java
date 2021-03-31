import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 숫자카드 2
public class boj10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr1 = new int[N];
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int [] arr2 = new int[M];
        int [] result = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
            result[i] = 0;
        }
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(arr1[j] == arr2[i]){
                    result[i]++;
                }
                    continue;
            }
        }
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
