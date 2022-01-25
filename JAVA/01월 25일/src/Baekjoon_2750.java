import java.util.Scanner;

public class Baekjoon_2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tmp = 0;
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < num; i++){
            for(int j = i+1; j < num; j++){
               if(arr[i] > arr[j]){
                   tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
               }
            }
        }

        for(int i = 0; i < num; i++){
            System.out.println(arr[i]);
        }
    }
}
