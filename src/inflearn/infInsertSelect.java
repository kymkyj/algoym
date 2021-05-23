package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 삽입정렬
public class infInsertSelect {
    public static int [] solution(int n, int [] arr){
        for(int i=0; i<n; i++){
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break; // tmp 보다 arr[j]가 크지 않으면 멈춰라
            }
            arr[j+1]= tmp; // 멈춘지점보다 하나 뒤에있는 곳에 tmp에 담아둔값을 넣어준다.
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i : solution(n, arr)){
            System.out.print(i + " ");
        }
    }
}
