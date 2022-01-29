import java.util.Scanner;

public class Baekjoon_2445 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1; i < num+1; i++){ // 5줄
            for(int j = 0; j < i; j++){ //
                System.out.print("*");
            }
            for(int k = 0; k <2*num-2*i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){ //
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = num-1; i > 0; i--){ // 4줄
            for(int j = 0; j < i; j++){ //
                System.out.print("*");
            }
            for(int k = 0; k <2*num-2*i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){ //
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
