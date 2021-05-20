package inflearn;
// least Recently Used 가장 최근에 사용하지 않은 것
/*
5 9                     -> 7 5 3 2 6
1 2 3 2 6 2 3 5 7
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class infLRUCache {
    public static int [] solution(int size, int n, int [] arr){
        int [] cache = new int[size];
        for(int x : arr){
            int pos = -1;
            for(int i=0; i<size; i++) if(x == cache[i]) pos=i; // 이 경우 hit
            if(pos == -1){ // miss 상황
                for(int i=size-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            else{
                for(int i=pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i : solution(s, n, arr)) {
            System.out.print(i + " ");
        }
    }
}
