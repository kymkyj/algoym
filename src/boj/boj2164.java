package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 카드2
public class boj2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=1; i<=N; i++){
            q.offer(i); // [1, 2, 3, 4]
        }
        int temp = 0;
        while(q.size() != 1){ // 큐의 크기가 1일때까지 반복
            q.poll();
            temp = q.poll();
            q.offer(temp);
        }
        System.out.println(q.element());
    }
}
