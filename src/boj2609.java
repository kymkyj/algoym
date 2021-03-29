import java.util.Scanner;

public class boj2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = gcd(a, b);	// 최대공약수

        System.out.println(d); // 최대공약수
        System.out.println(a * b / d); // 최소공배수 : 두수를 곱한거에서 최대공약수로 나눈 값

    }

    // 최대공약수 재귀 방식
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gcd(b, a % b);
    }
}