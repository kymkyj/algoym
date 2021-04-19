package inflearn;

// 재귀로 피보나치 수열 풀기
/*
    재귀 vs for문 피보나치
    성능은 압도적으로 for문이 좋다 -> 재귀는 스택프레임이 계속 돌아가기때문에 메모리적으로도 안좋고 속도도 안좋다.
 */
public class infRecursive4 {
    static int[] fibo;
    /*
        결과적으로 피보나치 수열을 돌면서
        값을 구하는 과정에서 반복되는 연산이 수행되는데
        결과적으로 내가 구하고자 하는 리턴값인 DFS(10)만 구하면 된다.
        그래서 반복되는 연산을 기억해놓기 위해서 배열에다가 담아두고 다시 수행되지 않게 기억해놓는다.
     */
    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n+1]; // 0번 인덱스가 필요없고 1~10번 인덱스로 사용하기위해
        DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }
    public static int DFS(int n){
        if(fibo[n] > 0) return fibo[n]; // 메모이제이션을 활용해서 시간복잡도를 확 줄여버린다!!
        if(n == 1) return fibo[n] = 1;
        else if(n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }
}
