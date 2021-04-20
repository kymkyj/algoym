package inflearn;

import java.util.*;
// 이진트리순회 DFS(Depth-First Search)
class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt=rt=null;
    }
}

public class infDfs1 {
    Node root;
    public void DFS(Node root){
        if(root==null) return;
        else{
            /*
                출력의 기준은 root가 중심이다.
             */
//            System.out.print(root.data + " "); // 앞에다가 이렇게 출력하면 전위순회가 된다!!
            DFS(root.lt); // 루트에서 왼쪽으로 뻗어나갈려면
//            System.out.print(root.data + " "); // 중간에다가 이렇게 놓으면 중위순회가 된다!!
            DFS(root.rt); // 루트에서 오른쪽으로 뻗어나갈려면..
            System.out.print(root.data + " "); // 끝에다 두면 후위순회가 된다!!
        }
    }
    public static void main(String[] args) {
        infDfs1 tree=new infDfs1();
        tree.root=new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
