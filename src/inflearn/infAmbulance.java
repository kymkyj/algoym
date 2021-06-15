package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 응급실
/*
    5 2                 3
    60 50 70 80 90
 */
class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority=priority;
    }
}

public class infAmbulance {
    public static int solution(int n, int m, int [] person){
       int answer = 0;
       Queue<Person> Q = new LinkedList<>();
       for(int i=0; i<n; i++){
           Q.offer(new Person(i, person[i]));
       }
       while(!Q.isEmpty()){
           Person tmp = Q.poll();
           for(Person x : Q){
               if(x.priority > tmp.priority){
                   Q.offer(tmp);
                   tmp = null;
                   break;
               }
           }
           if(tmp != null){
               answer++;
               if(tmp.id == m) return answer;
           }
       }
       return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 대기환자들
        int m = Integer.parseInt(st.nextToken()); // 지정환자
        int [] person = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            person[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, m, person));
    }
}
