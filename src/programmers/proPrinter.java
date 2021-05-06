package programmers;

import java.io.IOException;
import java.util.*;

public class proPrinter {
    public static int solution(int[] priorities, int location) {
        int answer = 0; // 몇번쨰로 나올지 확인 변수
        Queue<Integer> queue = new LinkedList<>();
        for(int i : priorities){
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            if(tmp == priorities[location]){ // 큐에서 꺼낸 첫번쨰 값이랑 위치한 값이 같을 때
                if(Collections.max(queue) > tmp){ // 만일 큐에서 더 큰게 있다면 다시 집어넣기
                    queue.offer(tmp);
                    location--;
                    if(location < 0){
                        location = priorities.length -1;
                    }
                }else{
                    answer++;
                    queue.offer(tmp);
                }
            }else if(tmp > priorities[location]){
                queue.remove(0);
                answer++;
                location = priorities.length - 1 - answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        int [] p = {1,1,9,1,1,1};
        int loc = 0;
        System.out.println(solution(p, loc));
    }
}
