import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // num1 + (num2* 갯수) > num3 * 갯수
        // 총비용과 총 수입이 같이지는 지점
        // num1 + (num2* 갯수) = num3 * 갯수 // 같아지는 지점이므로 +1

        if(num2 >= num3){
            System.out.println(-1);
        }else{
            System.out.println(num1/(num3-num2)+1);
        }

    }
}
