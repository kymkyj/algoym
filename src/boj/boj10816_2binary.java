package boj;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 숫자카드 2 이분탐색 방법
public class boj10816_2binary {
    static int[] arrN;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arrN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<arrN.length; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++) {
            int num = Integer.parseInt(st.nextToken());
            bw.append((upper_bound(num)-(lower_bound(num))+ " "));
        }
        bw.flush();
        bw.close();
        br.close();


    }
    static int lower_bound(int num) {
        int start = 0, last = arrN.length, mid;
        while(start<last) {
            mid = start + (last-start)/2;
            if(num <= arrN[mid]) {
                last = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
    static int upper_bound(int num) {
        int start = 0, last = arrN.length, mid;
        while(start < last) {
            mid = start + (last-start)/2;
            if(num >=arrN[mid])
                start = mid +1;
            else
                last = mid;
        }
        return start;
    }
}
