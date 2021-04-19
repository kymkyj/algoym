package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 가위바위보
public class infArray3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr1 = new int[N];
        int [] arr2 = new int[N];
        String A = br.readLine();
        String B = br.readLine();
        StringTokenizer st = null;
        st = new StringTokenizer(A);
        for(int i=0; i<N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(B);
        for(int i=0; i<N; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        for(String x : Solution(N, arr1, arr2)){
            System.out.println(x);
        }
    }
    public static ArrayList<String> Solution(int N, int [] arr1, int [] arr2){
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i<N; i++){ // 가위 1, 바위 2, 보 3
           if(arr1[i] == arr2[i]){
               answer.add("D");
           }else if(arr1[i] == 1 && arr2[i] == 3){ // A가 가위일때 이기는 경우
               answer.add("A");
           }else if(arr1[i] == 2 && arr2[i] == 1){ // A가 바위일때 이기는 경우
               answer.add("A");
           }else if(arr1[i] == 3 && arr2[i] == 2){ // A가 보일때 이기는 경우
               answer.add("A");
           }else{
               answer.add("B");
           }
        }
        return answer;
    }
}
