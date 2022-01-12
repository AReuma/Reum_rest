import java.util.Scanner;

public class ArTest {
    public static void main(String[] args) {
        int[] ho = new int[3];
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg =0.0;

        for(int i = 0; i < ho.length; i++){
            System.out.print(i+1+"호 월세를 입력하세요. (단위: 만원) >> ");
            ho[i] = sc.nextInt();
            // 저장공간 연산자 값

            sum += ho[i];
            System.out.println(ho[i]);
        }

        System.out.println("1동 총 월세: "+sum+"만원");
        //avg = (double)sum/ho.length;
        avg = Double.parseDouble(String.format("%.2f",(double)sum/ho.length));
        // String.format 문자열을 뒤의 값으로 변경한다. -> 변경 후 문자열이 됨. String 클래스에 있는 format 메서드
        // String은 클래스 타입이기 때문에 클래스로
        // Double.parseDouble

        System.out.println("평균 월세: "+avg+"만원");

    }
}
