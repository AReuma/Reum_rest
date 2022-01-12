import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int money = scanner.nextInt(); // 가진 돈
        //int member = scanner.nextInt(); // 나눠야하는 사람

        //System.out.println(money / member);
        //System.out.println(money % member);

        // ---- 런타임 오류 발생 -----
        // input Mismatch
        // 입력되야하는 값은?
        // 1 ≤ m ≤ n ≤ 10^1000
        // int는 2^32

        BigInteger money = scanner.nextBigInteger();
        BigInteger member = scanner.nextBigInteger();

        System.out.println(money.divide(member));
        System.out.println(money.remainder(member));
    }
}
