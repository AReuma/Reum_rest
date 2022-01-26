import java.util.Scanner;

public class Baekjoon_2443 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = num; i > 0; i--){
            for(int k = i; k < num; k++) {
                System.out.print(" ");
                //System.out.println(k);
            }
            for(int j = 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
