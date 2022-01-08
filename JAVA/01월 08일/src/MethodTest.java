public class MethodTest {

    int add(int num1, int num2){
        System.out.println("add 메서드 ");
        return num1 + num2;
    }

    // 컴파일할때 static을 하면 가장 먼저 실행된다.
    public static void main(String[] args) {
        //System.out.println(add(3, 7));

        MethodTest mt = new MethodTest();
        System.out.println(mt.add(3,7));
    }
}
