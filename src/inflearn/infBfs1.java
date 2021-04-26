package inflearn;
import java.util.*;
// 이진트리 순회 - 넓이 우선 탐색(레벨탐색) 큐사용해서 구현
class Node2{
    int data;
    Node2 lt, rt;
    public Node2(int val){
        data = val;
        lt=rt=null;
    }
}

public class infBfs1 {
    Node2 root;
    public  void BFS(Node2 root){
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L+" : ");
            for (int i=0; i<len; i++){
                Node2 cur = Q.poll();
                System.out.print(cur.data+ " ");
                if(cur.lt != null) Q.offer(cur.lt); // 왼쪽 자식 넣음
                if(cur.rt != null) Q.offer(cur.rt); // 오른쪽 자식 넣음
            }
            L++;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        infBfs1 tree=new infBfs1();
        tree.root=new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);
        tree.BFS(tree.root); // root 노드의 주소를 가지고 있는 것
    }
}
