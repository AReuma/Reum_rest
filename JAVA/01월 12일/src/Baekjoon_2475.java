import java.util.Scanner;

public class Baekjoon_2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num6 = 0;
        for(int i = 0; i < 5; i++){
            int num = scanner.nextInt();
            num6 += num*num;
        }

        System.out.println(num6%10);
    }
}
