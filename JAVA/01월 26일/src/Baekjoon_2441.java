import java.util.Scanner;

public class Baekjoon_2441 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) { // i = 5
            for(int k = 0; k < i; k++ ){
                System.out.print(" ");
            }
            for (int j = num; j > i; j--) {  // j = 0
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
