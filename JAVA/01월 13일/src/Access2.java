public class Access2 {
    void function(){
        Access a = new Access();
        System.out.println(a.data1);
        System.out.println(a.data2);
        System.out.println(a.data3);

        a.data3 = 40;
        System.out.println(a.data3);
    }

    public static void main(String[] args) {
        Access2 a = new Access2();
        a.function();
    }
}
