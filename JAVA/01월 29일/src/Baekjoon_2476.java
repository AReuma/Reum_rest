import java.util.Scanner;

public class Baekjoon_2476 {
    public static void main(String[] args) {
        // 3개의 주사위를 돌린다.
        // 같은 눈 3개, 같은 눈 2개, 모두 다른 에 따라 금액을 받게 됨.
        // 가장 많은 상금을 받은 사람을 출력.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN +1;
        int[] sameNum = new int[num];
        int[] sameCnt = new int[num];
        int[] max = new int[num];
        int[] money = new int[num];
        int winMoney = 0;

        int[][] diceNum = new int[num][3];

        for(int i = 0; i < num; i++){
            for(int j = 0; j < 3; j++){
                diceNum[i][j] = scanner.nextInt();

                if(max[i] < diceNum[i][j]){
                    max[i] = diceNum[i][j];
                }
            }
        }

        for(int k = 0; k < num; k++){ // 멤버 수

            for(int i =0; i < 3; i++){
                for(int j = i+1; j < 3; j++){
                    if(diceNum[k][i] == diceNum[k][j]){
                        sameCnt[k]++;
                        sameNum[k] = diceNum[k][i];
                    }
                }
            }
        }

/*
        for(int i = 0; i < 3; i++){
            System.out.print(sameNum[i]+" ");
            System.out.print(sameCnt[i]);
            System.out.println();
        }

 */

        for(int i = 0; i < num; i++){
            switch (sameCnt[i]){
                case 1:
                    money[i] = 1000+sameNum[i]*100;
                    break;
                case 3:
                    money[i] = 10000+sameNum[i]*1000;
                    break;
                default:
                    money[i] = max[i]* 100;
                    break;
            }
        }

        for(int i = 0; i < num; i++){
            if(winMoney < money[i]){
                winMoney = money[i];
            }
        }

        System.out.println(winMoney);

    }
}
