public class SquareArea {
    public static void main(String[] args) throws InterruptedException {

        // 여기서 thread가 필요한 이유는 뭐죠..?

        Thread a = new Thread(new Area());

        a.start();

        a.join();

        System.out.println("결과: "+Area.getArea());
    }
}
