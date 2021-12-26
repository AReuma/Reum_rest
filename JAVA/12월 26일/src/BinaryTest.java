public class BinaryTest {
    public static void main(String[] args) {
        // 10진수 131을 -> 2진수 1000 0011 계산기를 만들어라
        final int NUMBER = 2;
        int DEX_NUMBER = 25;

        int num[] = new int[9];

        for(int i = 0; i < 9; i++){
            if(!(DEX_NUMBER == 0) || !(DEX_NUMBER == 1)){
                num[i] = DEX_NUMBER % NUMBER;
                DEX_NUMBER = DEX_NUMBER/NUMBER;
            }
        }

        for(int j = 7; j >= 0; j--){
            System.out.print(num[j]);
        }
    }
}
