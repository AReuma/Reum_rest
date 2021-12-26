import java.util.Scanner;

public class IfWhileScannerTest_8 {
    //키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
    //입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!
    public static void main(String[] args) {

        final int NUMBER = 2;
        Scanner sc = new Scanner(System.in);
        //int num1 = sc.nextInt();

        int num1 = 1;

        boolean isCheck = false;

        while(!(num1 == 0)){

            num1 = sc.nextInt();

          if(num1 % NUMBER == 0){
              System.out.printf("짝수 : %d\n", num1);
          }else
              System.out.printf("홀수 : %d\n", num1);


        }
    }
}
