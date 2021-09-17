package bojNaming;

import java.util.Scanner;

public class bojRepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 입력 값 저장
        int index = sc.nextInt();

        // 테스트 케이스 개수만큼 반복
        for (int i = 0; i < index; i++) {
            int temp = sc.nextInt();
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                // 반복 출력 횟수 만큼 반복
                for (int k = 0; k < temp; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            // 줄바꿈
            System.out.println();
        }
    }
}
