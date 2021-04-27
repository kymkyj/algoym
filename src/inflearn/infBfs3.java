package inflearn;

import java.util.*;
// 이진트리 순회 - 넓이 우선 탐색(레벨탐색) 큐사용해서 구현
class Node3{
    int data;
    Node3 lt, rt;
    public Node3(int val){
        data = val;
        lt=rt=null;
    }
}

public class infBfs3 {
    Node3 root;
    public int BFS(Node3 root){
        Queue<Node3> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Node3 cur=Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        infBfs3 tree=new infBfs3();
        tree.root=new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);
        System.out.println(tree.BFS(tree.root)); // root 노드의 주소를 가지고 있는 것
    }
}
