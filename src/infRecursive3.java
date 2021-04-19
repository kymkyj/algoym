// 재귀로 펙토리얼 구하기
public class infRecursive3 {
    public static void main(String[] args) {
        System.out.println(DFS(5));
    }
    public static int DFS(int n){
        if(n==1) return 1; // 0을 곱하면 0이되버리니까
        else return n*DFS(n-1);
    }
}
