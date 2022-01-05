public class SelectSort {
    public static void main(String[] args) {
        int[] num = {10, 5, 4, 9, 2};

        int saveNum;
        for(int i = 0; i < 5; i++){
            System.out.println(num[i]);
        }

        for(int i =0; i < 5; i++){
            for( int j = i+1; j < 5; j++){
                if(num[i] > num[j]){ // 앞에 있는 숫자가 더 클때,
                    saveNum = num[i]; // 앞에 있는 숫자.
                    num[i] = num[j];
                    num[j] = saveNum;
                }
            }
        }

        System.out.println("------");
        for(int i = 0; i < 5; i++){
            System.out.print(num[i]+" ");
        }

    }
}
