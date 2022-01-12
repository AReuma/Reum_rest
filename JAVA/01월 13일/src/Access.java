public class Access {
// 메인 클래스에서만 public을 붙일 수 있다.

    int data1 = 10;
    public int data2 = 20;
    protected int data3 = 30;
    private int data4 = 40;

    public int getData4(){ // private에 접근하는 방법
        return data4;
    }

    void f(){
    }

}

class Cloud{

    void function(){
        Access a = new Access();
        // data4는 접근 못함.
        // private 선언된 영역에서만 접근 가능.
    }
}
