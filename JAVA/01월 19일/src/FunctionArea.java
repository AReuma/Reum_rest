public class FunctionArea implements Runnable {
    private final double num = 0.001;

    private static double ga;
    private static int se;
    private static double area;
    private static int count;
    static double a;

    public FunctionArea(int x){
        ga = x;
        se = x*x;

        area = 0.0;

        count =(int)(ga/num);
    }

    public void addArea(){
        try{
            a = se*num;
            area = area + a;
            System.out.println(area);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // lock.unlock();
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < count; i++){
            // System.out.println(i);
            addArea();
        }
    }

    public static double getArea() {
        return area;
    }
}
