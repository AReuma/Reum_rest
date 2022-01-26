import java.util.Scanner;

public class Baekjoon_2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0; i < num; i++){ // 0~ 5
            for(int j = num-1; j > i; j--){
                //System.out.print(i);
                System.out.print(" ");
            }
            for(int k = 0; k < 2*(i+1)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = num-1; i > 0; i--){ // 4 ~ 1
            for(int j = i; j < num; j++){
                // System.out.print("!");
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
