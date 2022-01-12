import java.util.Scanner;

public class ArShop {
    public static void main(String[] args) {
        // ZARA
        // 강남점, 코엑스점, 명동점
        // 지점별 매출액. (백만원 단위)
        // 단, 평균 매출액은 만원단위까지 출력. 소수둘째자리까지

        int[] ArZara = new int[3];
        String[] arName = {"강남점","코엑스점","명동점"};
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0.0;

        String best = "없음";

        for(int i = 0;  i< ArZara.length; i++){
            System.out.println(arName[i]+"매출액을 입력해주세요 (단위: 백만원)");
            ArZara[i] = scanner.nextInt();

            sum += ArZara[i];
        }

        avg = Double.parseDouble(String.format("%.2f",(double)sum/ArZara.length));

        System.out.println("ZARA 총 매출액: "+ sum + "백만원");
        System.out.println("평균 매출액: "+avg+"만원");

        for(int i = 0; i < ArZara.length; i++){
            if(avg < ArZara[i]){
                best = "";
                best += arName[i] + "\n";
            }
        }
        System.out.println("인센티브 매장\n"+best);
    }
}
