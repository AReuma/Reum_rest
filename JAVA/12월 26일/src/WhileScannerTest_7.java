import java.util.Scanner;

public class WhileScannerTest_7 {
    public static void main(String[] args) {
        //1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.

        final int NUMBER = 3;

        Scanner sc = new Scanner(System.in);

        System.out.println("3의 배수를 판별합니다.\n0을 입력하면 멈춥니다.");
        System.out.println("숫자를 입력해주세요 >> ");

        int num1 = 1;

        while (!(num1 == 0)){ // 여기서는 if(num1 == 0)이렇게 하는게 더 편리하지않을까..?

            num1 = sc.nextInt();

            if(num1 % NUMBER == 0){
                System.out.println("3의 배수입니다.");
            } else
                System.out.println("3의 배수가 아닙니다.");

        }

    }
}
