package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 씨름 선수
/*
    5
    172 67
    183 65
    180 70
    170 72
    181 60
 */
class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w){
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o){
        return o.h-this.h;
    }
}

public class infSunsu {
    public int solution(ArrayList<Body> arr, int n){
        int answer = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(Body ob : arr){
            if(ob.w > max){
                max = ob.w;
                answer++;
            }
        }


        return answer;
    }
    public static void main(String[] args) throws IOException {
        infSunsu T = new infSunsu();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }
}
