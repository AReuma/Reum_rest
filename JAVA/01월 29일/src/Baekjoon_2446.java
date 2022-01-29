import java.util.Scanner;

public class Baekjoon_2446 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int l = 0, a = 1;
        for(int i = num; i > 0; i--,l++){ // 5줄
            for(int k = 0; k < l; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //System.out.println(l);
        for(int i = num-1; i > 0; i--, a++){ // 4 ~ 1
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k =1; k <= 2*a+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
