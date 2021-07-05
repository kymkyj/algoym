package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class PizzaPoint{
    public int x, y;
    PizzaPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class infPizzaDelivery_sol {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int [] combi;
    static ArrayList<PizzaPoint> hs, pz; // 집의 좌표와 피자집의 좌표를 넣어주는 리스트
    public void DFS(int L, int s){
        if(L==m){ // 이 경우에 조합 한개가 완성됨
//            for(int x : combi) System.out.print(x + " ");
//            System.out.println();
            int sum = 0;
            for(PizzaPoint h : hs){
                int dis = Integer.MAX_VALUE;
                for(int i : combi){
                    dis=Math.min(dis, Math.abs(h.x-pz.get(i).x) + Math.abs(h.y-pz.get(i).y)); // 거리값 계산한 것
                }
                sum += dis; // sum은 도시의 피자배달거리
            }
            answer = Math.min(answer, sum);
        }else{
            for(int i=s; i<len; i++){
                combi[L] = i; // 0부터 5사이에서 m개를 뽑아내는 것
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        infPizzaDelivery_sol T = new infPizzaDelivery_sol();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        hs = new ArrayList<>();
        pz = new ArrayList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp == 1) hs.add(new PizzaPoint(i, j)); // 집이면 hs에 add
                else if(tmp == 2) pz.add(new PizzaPoint(i, j)); // 피자집이면 pz에 add
            }
        }
        len = pz.size(); // 우리가 구할려는거는 len C m
        combi = new int[m];
        T.DFS(0,0);
        System.out.println(answer);
    }
}
