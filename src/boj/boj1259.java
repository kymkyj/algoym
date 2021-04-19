package boj;

import java.util.Scanner;

// 펠린드롭
public class boj1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String input = sc.next();
            if (input.startsWith("0")) {
                break;
        }
            char[] charStr = input.toCharArray();
            String str1 = "";
            String str2 = "";
            for (int i = 0; i < charStr.length; i++) {
                str1 += charStr[i];
            }
            for (int j = charStr.length - 1; j >= 0; j--) {
                str2 += charStr[j];
            }
            System.out.println(str1.equals(str2) ? "yes" : "no");
        }
    }
}
