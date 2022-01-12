public class Car {
    int price; //객체
    String color; //객체
    String brand; // 전역변수들

    Car(){ } // 오버로딩

    Car(int price, String color, String brand){ // 지역변수
        // 주소가 있는 this // 그 객체의 price
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    double speedUp(double speed){
        speed++;
        return speed;
    }

    double speedDown(double speed){
        speed--;
        return speed;
    }

    void showInfo(){
        System.out.println(this);
        //this.brand 생략되어 있음
        //this 그 주소의 brand
        System.out.println("브랜드: "+brand+"\n색상: "+color+"\n가격: "+price+"만원");
    }

    public static void main(String[] args) {
        // 객체화
        // 인스턴스 변수 (예를들어) -> momCar  : 이제 Car()를 momCar로 할거야!
        // 클래스명(): 기본 생성자
        // 클래스를 선언하면 자동으로 선언되는 생성자
        Car momCar = new Car(9000, "Benz", "Black");
                         // 기본생성자
        // 초기화를 쉽게 할 수 있도록 만들어둔게 생성자
        // 생성자는 new 뒤에 있는것과 똑같은 이름.
        Car dadyCar = new Car();
        Car myCar = new Car();

        momCar.showInfo();
        dadyCar.showInfo();
        myCar.showInfo();

//
//        momCar.brand = "Benz";
//        momCar.color = "Black";
//        momCar.price = 9000;
//
//        momCar.showInfo();
//        System.out.println(momCar);
//
//        System.out.println();
//
//        dadyCar.showInfo();
//        System.out.println(dadyCar);

    }

}
