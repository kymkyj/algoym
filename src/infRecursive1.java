// 재귀함수
public class infRecursive1 {

    public static void main(String[] args) {
        DFS(3);
    }
    /*
        DFS : 깊이 우선 탐색
        구현하는 방법은 크게 스택과 재귀를 통해서 할 수 있다.
        재귀를 사용하면 좀더 간단하게 코드를 구현할 수 있는데
        재귀는 스택프레임이라는 개념을 가진다.
        스택프레임 : 재귀가 돌면서 생성되는 스택프레임이라는 곳에는
        매개변수 정보, 지역변수 정보, 복귀 주소등이 쌓인다.
        스택이 수행되면서 제일 상단에서 pop을 하고 그다음 복귀주소로 넘어가는 개념임을 명심하자
     */

    public static void DFS(int n){
        if(n == 0) return; // 0이되면 return을 만나서 함수가 종료됨
        else{
            DFS(n-1);
            System.out.println(n);
        }
    }
}
