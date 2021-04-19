package inflearn;

// 재귀로 2진수 출력하기
public class infRecursive2 {
    public static void main(String[] args) {
        DFS(11);
    }
    public static void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.print(n%2 +"");
        }
    }
}
