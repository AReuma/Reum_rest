import java.util.Scanner;

public class Baekjoon_2442 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0; i < num; i++){ // 0~ 5
            for(int k = num-1; k > i; k--){ // 4 ~ 0
                //System.out.println(k);
                System.out.print(" ");
            }
            for(int j = 0; j < 2*(i+1)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
