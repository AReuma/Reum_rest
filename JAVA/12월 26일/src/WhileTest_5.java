public class WhileTest_5 {
    public static void main(String[] args) {
        //1 ~ 20까지의 숫자중 2의 배수만 출력해봅시다.
        // while문제인데 while로 어떻게 하지..?

        int num1 = 1;
        while (num1 <= 20){
            if(num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1++;
        }
        System.out.println();
        System.out.println();
        System.out.println();

        final int START = 1;
        final int END = 20;

        final int NUMBER = 2;

        for(int i = START; i <= END; i++){
            if (i % NUMBER == 0){
                System.out.println(i);
            }
        }
    }
}
