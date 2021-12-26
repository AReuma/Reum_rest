import java.util.Scanner;

public class ScannerTest_4 {
    public static void main(String[] args) {

        final int END = 3;

        Scanner scanner = new Scanner(System.in);

        //int num1 = scanner.nextInt();
        //int num2 = scanner.nextInt();
        //int num3 = scanner.nextInt();

        //int result = num1+ num2+ num3;

        //System.out.println("3개의 숫자 합은 "+result);

        //배열을 사용할 수 있겠지?
        int num[] = new int[END+1];

        int sum =0;
        for (int i = 0; i <= END; i++){
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        System.out.printf("%d개의 수 합은: %d",END, sum);



    }
}
