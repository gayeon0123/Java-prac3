package 객체지향문법3.생성자2;

// super() 생성자
//  : 부모의 생성자를 호출할 때 사용
//  : 부모 생성자를 의미
//  : 생성자 안에서만 사용가능
//  : 생성자 안에서 첫번째 줄에만 올 수 있다
//  : 생성자는 무조건 super() 생성자를 호출해야 한다
//    사용자가 super()생성자를 호출하는 코드를 작성하지 않았다면 자동으로 부모의 기본 생성자가 호출된다.
//  : 부모클래스가 기본 생성자를 갖고 있지 않다면, 사용자는 반드시 직접 super()생성자를 호출해줘야 한다

public class Bus2 extends Car2 {

    public Bus2() { // 자동으로 생성되는 기본생성자
        super("bus!!"); // 부모의 기본 생성자를 호출하는 코드가 자동으로 삽입된다
        System.out.println("Bus2 기본생성자");
    }
}
