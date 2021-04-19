package boj;

import java.util.Arrays;
import java.util.Scanner;

public class boj1920_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] arrA = new int[N];
        for(int i=0; i<N; i++){
            arrA[i] = sc.nextInt();
        }
        Arrays.sort(arrA);

        int M = sc.nextInt();

        int[] arrB = new int[M];
        for(int i=0; i<M; i++){
            arrB[i] = sc.nextInt();
        }
        for (int i=0; i<M; i++){
            System.out.println(bSearch(arrA, arrB[i]));
        }
    }
    public static int bSearch(int[] arr, int num){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(low <= high){
            mid = (low + high)/2;
            if(arr[mid] == num) return 1;

            else if(arr[mid] > num) high = mid-1;
            else if(arr[mid] < num) low = mid+1;
        }
        return 0;
    }
}
