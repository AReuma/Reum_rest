public class ArTest {
    public static void main(String[] args) {
        int[] arData = new int[4];
        System.out.println(arData); // [ 배열이라는 뜻, I int, @이후 숫자는 주소값
        System.out.println(arData[0]);
        arData[0] = 10;
        System.out.println(arData[0]);

        // 배열을 만들때 크기를 지정해주기 때문에
        // 배열.length는 상수로 지정됨.
    }
}
