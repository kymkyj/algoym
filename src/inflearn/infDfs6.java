package inflearn;

// 부분집합 구하기(DFS)
public class infDfs6 {
    static int n;
    static int[] ch; // 사용한다 사용안한다 체크하기위해
    public void DFS(int L){
        if (L==n+1){
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        }
        else{
            ch[L] = 1;
            DFS(L+1); // 사용한다하고 뻗는 함수
            ch[L] = 0;
            DFS(L+1); // 사용하지 않는다 하고 뻗는 함수
        }
    }
    public static void main(String[] args) {
        infDfs6 T= new infDfs6();
        n = 3;
        ch=new int[n+1];
        T.DFS(1);
    }
}
