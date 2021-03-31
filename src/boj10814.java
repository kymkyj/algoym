import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 나이순 정렬
public class boj10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        String [][] arr = new String[N][2];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr,new Comparator<String[]>(){
            @Override
            public int compare(String[] one, String[] two){
                return Integer.compare(Integer.parseInt(one[0]),Integer.parseInt(two[0]));
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(arr[i][0] +" "+ arr[i][1]);
        }

    }
}
