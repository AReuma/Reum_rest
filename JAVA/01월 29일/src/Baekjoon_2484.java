import java.util.Scanner;

public class Baekjoon_2484 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] sameNum = new int[num];
        int[] sameCnt = new int[num];
        int[] max = new int[num];
        int[] money = new int[num];
        int winMoney = 0;
        int[] anotherNum = new int[num];

        int[][] diceNum = new int[num][4];

        for(int i = 0; i < num; i++){
            for(int j = 0; j < 4; j++){
                diceNum[i][j] = scanner.nextInt();

                if(max[i] < diceNum[i][j]){
                    max[i] = diceNum[i][j];
                }
            }
        }

        for(int k = 0; k < num; k++){ // 멤버 수
            for(int i =0; i < 4; i++){
                for(int j = i+1; j < 4; j++){
                    if(diceNum[k][i] == diceNum[k][j]){
                        sameCnt[k]++;
                        sameNum[k] = diceNum[k][i];
                        }
                }
            }

            if(sameCnt[k] == 2){
                for(int l = 0; l < 4; l++){
                    if(sameNum[k] != diceNum[k][l]){
                        anotherNum[k] = diceNum[k][l];
                    }
                }
            }
        }

        /*
        for(int i = 0; i < 4; i++){
            System.out.print(sameNum[i]+" ");
            System.out.print(sameCnt[i]);
            System.out.println();
        }
         */
        //System.out.println(anotherNum);


        for(int i = 0; i < num; i++){
            switch (sameCnt[i]){
                case 6: // 4개 전부 같을 경우
                    money[i] = 50000+sameNum[i]*5000;
                    break;
                case 3: // 3개 전부 같을 경우
                    money[i] = 10000+sameNum[i]*1000;
                    break;
                case 2: // 2개씩 두쌍
                    money[i] = 2000+sameNum[i]*500+anotherNum[i]*500;
                    break;
                case 1: // 같은 눈이 2개
                    money[i] = 1000+sameNum[i]*100;
                    break;
                default: // 같은 눈이 없을 경우
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
