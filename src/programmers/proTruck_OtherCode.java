package programmers;

import java.util.*;

public class proTruck_OtherCode {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<int[]> queue = new LinkedList<>();
        int time = 0, idx = 0;

        while (idx < truck_weights.length) {
            //트럭이 머무는 시간에 도달 했을 경우
            if (!queue.isEmpty() && time == queue.peek()[1]) {

                int[] truck = queue.poll(); //다리를 지남

                //트럭이 나가서 하중 증가
                weight += truck[0];
            }

            //남은 하중 보다 트럭 하중이 작으면
            if (weight >= truck_weights[idx]) {
                //배열 {진입한 트럭의 무게, 도달시간}
                queue.add(new int[]{truck_weights[idx], time + bridge_length});
                //트럭이 올라가고 남은 하중
                weight -= truck_weights[idx++];
            }

            time++;
        }

        return time + bridge_length;

    }

}
