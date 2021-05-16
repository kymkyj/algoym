package programmers;

import java.util.Arrays;

// 완주하지 못한 선수
public class proPlayer {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            Arrays.sort(participant);
            Arrays.sort(completion);
            int i;
            for(i=0; i<completion.length; i++){
                if(!participant[i].equals(completion[i])){
                    return participant[i];
                }
            }
            return participant[i];
        }
    }
    public static void main(String[] args) {
        String  [] participant = {"leo", "kiki", "eden"};
        String  [] completion = {"eden", "kiki"};
    }
}
