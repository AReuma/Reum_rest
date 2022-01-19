public class FunctionTest {
    public static void main(String[] args) {
        Thread fa = new Thread(new FunctionArea(3));

        fa.start();
    }
}
