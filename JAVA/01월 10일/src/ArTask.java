public class ArTask {
    public static void main(String[] args) {
        int[] arData1 = new int[5];
        int[] arData2 = new int[10];

        for(int i = 0; i < arData1.length; i++){
            arData1[i] = i+1;
            System.out.println(arData1[i]);
        }

        System.out.println("--- 기준 ---");

        for(int i = arData2.length -1; i >= 0; i--){
            arData2[i] = i+1;
            System.out.println(arData2[i]);
        }

        System.out.println("--- 기준 ---");

        for(int i = 0; i < arData2.length; i++){
            arData2[i] = 10 -i;
            System.out.println(arData2[i]);
        }

    }
}
