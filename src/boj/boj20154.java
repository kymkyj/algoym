package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 이 구역의 승자는 누구야?
// ABCDE    홀수    I'm a winner!
// AECF     짝수    You're the winner?
public class boj20154 {
    /*
        A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z
        3	2	1	2	3	3	3	3	1	1	3	1	3	3	1	2	2	2	1	2	1	1	2	2	2	1
     */
    static char [] alpa = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static int [] number = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
    static List<Integer> list = new ArrayList<>();
    public static boolean solution(String s){
        for(int i=0; i<s.length(); i++) {
            for (int j = 0; j < alpa.length; j++) {
                if(s.charAt(i) == alpa[j]){
                    list.add(number[j]);
                }
            }
        }
        int sum = 0;
        for(int i : list){
            int tmp = 0;
            tmp += i;
            sum += tmp;
        }
        if(sum % 2 == 1) return true; return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean result = solution(str);
        if(result){
            System.out.println("I'm a winner!");
        }else{
            System.out.println("You're the winner?");
        }
    }
}
