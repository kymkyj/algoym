package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj1260 {
    static int n; //정점의 개수
    static int m; //간선의 개수
    static int v; //정점의 번호
    static int graph[][]; //연결상태
    static int[] visited; //방문했는지 안했는지
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        v = scanner.nextInt();
        graph = new int[n+1][n+1];
        visited = new int[n+1];

        for (int i=0; i<m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            graph[x][y] = graph[y][x] = 1;
        }
        DFS(v);
        System.out.println();
        visited = new int[n+1];
        BFS(v);

    }

    public static void DFS(int i) {
        visited[i] = 1; //방문 처리: true
        System.out.print(i + " ");
        for (int j=1; j<=n; j++) {
            if (graph[i][j] == 1 && visited[j] == 0) {
                DFS(j);
            }
        }
    }
    public static void BFS(int i) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(i);
        visited[i] = 1; // 방문 체크 위해
        System.out.print(i + " ");
        while (!queue.isEmpty()) {
            int tmp = queue.poll(); // 1

            for (int j=1; j<=n; j++) {
                if (graph[tmp][j] == 1 && visited[j] == 0) { // 1에 딸려있는 자식노드들 검색
                    queue.offer(j);
                    visited[j] = 1;
                    System.out.print(j + " ");
                }
            }
        }
    }
}
