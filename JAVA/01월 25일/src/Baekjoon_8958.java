import java.util.Scanner;

public class Baekjoon_8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String[] arr = new String[num];

        for(int i = 0; i < num; i++){
            arr[i] = scanner.next();
        }

        char tmp = ' ';
        int oCnt;
        int[] score = new int[num];
        for(int i = 0; i < num; i++) {
            oCnt = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                tmp = arr[i].charAt(j);
                //System.out.println(tmp);
                if (tmp == 'X') {
                    //System.out.println("X");
                    oCnt = 0;
                }else if(tmp == 'O'){
                    //System.out.println("O");
                    score[i]++;
                    if(oCnt >= 1) {
                        score[i] += oCnt;
                        //System.out.println("연속정답 : "+score[i]);
                    }
                    oCnt++;
                }
            }
        }

        for(int i = 0; i < num; i++){
            System.out.println(score[i]);
        }
    }
}
