public class Animal {

    String name;
    String sound;
    String feed;
    boolean tail;
    int leg;

    Animal(String name, String sound, boolean tail, int leg, String feed){
        this.name = name;
        this.sound = sound;
        this.leg = leg;
        this.tail = tail;
        this.feed = feed;
    }

    void eat(){
        System.out.println(name+"이/가 "+ feed+"를 먹는중");
    }

    void showInfo(){
        System.out.println(name+"의 울음 소리는 "+ sound);
        System.out.println(name+"의 꼬리는 있을까요? "+ tail);
        System.out.println(name+"의 다리는 몇개? "+ leg);
    }

    public static void main(String[] args) {
        Animal cat = new Animal("고양이","야옹", true, 4, "츄르");
        cat.showInfo();
        cat.eat();
    }
}
