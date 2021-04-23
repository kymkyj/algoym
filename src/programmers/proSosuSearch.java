package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 소수찾기
// 경우의 수를 어떻게 나열할까?
public class proSosuSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
//        System.out.println(solution(n));
        solution(n);
    }

    public static void solution(String numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Character> q = new LinkedList<>();
        int answer = 0; // 소수판단 카운트

        // 1자리수들 다 검색
        char [] oneChance = numbers.toCharArray();
        for(int i=0; i<oneChance.length; i++){
            result.add(Integer.parseInt(String.valueOf(oneChance[i])));
        }
        // 2자리수들 다 검색
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<oneChance.length; i++){
            for(int j=0; j<oneChance.length; j++){
                sb.append(oneChance[i]);
                sb.append(oneChance[j]);
                result.add(Integer.parseInt(sb.toString()));
                sb.setLength(0); // 빌더 초기화
            }
        }
        // 3자리수들 다 검색
        for(int i=0; i<oneChance.length; i++){
            q.offer(oneChance[i]);
        }



//        for(int i=0; i<result.size(); i++){
//            System.out.print(result.get(i)+ " ");
//        }


//        return answer;
    }
}

