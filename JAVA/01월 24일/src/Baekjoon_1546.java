import java.util.Scanner;

public class Baekjoon_1546 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int subj = scanner.nextInt();
        int[] score = new int[subj];
        int max = 0;
        for(int i = 0; i < subj; i++){
            score[i] = scanner.nextInt();
            if(score[i] > max){
                max = score[i];
            }
        }

        double avg = 0.0;
        for(int i = 0; i < subj; i++){

            avg += (double) score[i]/max*100;
        }
        System.out.println(avg/subj);

    }
}
