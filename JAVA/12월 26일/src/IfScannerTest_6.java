import java.util.Scanner;

public class IfScannerTest_6 {
    public static void main(String[] args) {
        final int NUMBER = 3;

        Scanner myScanner = new Scanner(System.in);

        int num1 = myScanner.nextInt();

        if(num1 % NUMBER == 0){
            System.out.printf("%d는 3의 배수입니다.",num1);
        }else
            System.out.printf("%d는 3의 배수가 아닙니다.",num1);

    }
}
