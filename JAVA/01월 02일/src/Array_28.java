import java.math.BigInteger;
import java.util.Scanner;

public class Array_28 {
    public static void main(String[] args) {
        //아래와 같은 형태의 숫자들이 있다.
        //1, 3, 9, 27, 81, 243, 729, 2187, ...
        //n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!

        final BigInteger START = new BigInteger("1");
        final int NUM = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 자리수를 적어주세요 >>>");
        int num1 = scanner.nextInt();

        BigInteger[] arry = new BigInteger[num1];

        BigInteger base = new BigInteger("1");
        for(int i =0; i < num1; i++){
            arry[i] = base;
            base = base.multiply(BigInteger.valueOf(NUM));

            System.out.println(arry[i]);
        }
        //System.out.println(arry[num1]);
    }
}
