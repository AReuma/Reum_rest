import java.util.Scanner;

public class Baekjoon_1550 {
    public static void main(String[] args) {
        // 16진수를 입력받아 10진수를 풀력

        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();

        System.out.println(Integer.parseInt(num, 16));
        //Integer.parseInt(String num);
        // 숫자형 문자열을 -> 10진수 integer 형으로 변경

        // Integer.parseInt(String num, 8)
        // 숫자형 문자열을 -> 두번째 인자값의 진수로 integer형 변환
    }

}
