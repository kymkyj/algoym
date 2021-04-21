package programmers;

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        // prices 주식가격이 담긴 배열
        int[] answer = new int[prices.length]; // 가격의 기간을 담을 배열
        int count=0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                count++;
                if(prices[i] > prices[j]){
                    break;
                }
            }
            answer[i] = count;
            count=0;
        }

        return answer;
    }
}

