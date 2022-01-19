import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Area implements Runnable {
    private final double num = 0.001;

    private static double ga;
    private static int se;
    private static double area;
    private static int count;
    static double a;
    // private Lock lock;

    public Area(){
        ga =2;
        se =2;
        a= 0.0;
        area = 0.0; // 내가 생각하는 Critical Section

        count =(int)(ga/num);
        // lock = new ReentrantLock();
    }

    public void addArea(){
        try{
            // lock.lock();
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
