import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// 수 정렬하기2
public class boj2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] result = new int[N];
        for(int i=0; i<N; i++){
            result[i] = Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(result);
        for(int i=0; i< N; i++){
            sb.append(result[i]);
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}
