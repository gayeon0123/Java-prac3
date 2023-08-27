package 객체지향문법2.상속1;

// toString()을 오버라이딩
public class CarEx02 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1); // println(Object x) : Object로 참조할 수 있는 것은 무엇이든 참조 가능하다
        System.out.println(c1.toString());
    }
}

// 부모타입의 변수로 자식인스턴스를 참조할 수 있다
// 조상타입의 변수로 후손인스턴스를 참조할 수 있다

// Car c1 = new Bus();
// Car c2 = new 이층버스(); // Bus, 이층버스는 모두 Car의 자손이라는 의미

// Object o1 = new Car();
// Object 02 = new Bus();
// Object 03 = new 이층버스(); // Car, Bus, 이층버스는 모두 Car의 자손이라는 의미

// System.out.println(o1.toString()); == System.out.println(o1);