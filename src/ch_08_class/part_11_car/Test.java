package ch_08_class.part_11_car;

public class Test {
    /*
    인스턴스 변수는 각각의 인스턴스마다 고유의 저장 공간을 가지고 있기 때문에 독립적으로 고유값을 저장 가능.

    클래스 변수는 1) 하나의 저장 공간을 모든 인스턴스가 함께 공유하기 때문에
    하나의 참조변수로 값을 변경하더라도 모두 인스턴스의 값이 변하게 됨.
    2) 인스턴스 생성전에 접근가능하기 때문에 클래스 이름으로 접근이 됨.
     */
    public static void main(String[] args) {
        System.out.println(Car.wheel); // 클래스 이름으로 접근 가능
       // System.out.println(Car.speed); // 에러발생! 인스턴스 변수는 클래스 이름으로 접근 불가

        Car car1 = new Car();
        System.out.println(car1.speed); // 인스턴스 생성 후에 접근 가능

        Car car2 = new Car();

        System.out.println("<변경 전>");
        System.out.println("myCar1.speed: " + car1.speed); // 0
        System.out.println("myCar2.speed: " + car2.speed); // 0
        System.out.println("myCar1.wheel: " + car1.wheel); // 4
        System.out.println("myCar2.wheel: " + car2.wheel); // 4
        // 클래스 변수도 인스턴스를 이용해서 접근은 가능하나, 가급적 인스턴스를 이용해서는 접근을 하지 않는 것이 좋음.

        car2.speed = 100;
        car2.wheel = 5;
        System.out.println("<변경 후>");
        System.out.println("myCar1.speed: " + car1.speed); // 0
        System.out.println("myCar2.speed: " + car2.speed); // 100
        System.out.println("myCar1.wheel: " + car1.wheel); // 5
        System.out.println("myCar2.wheel: " + car2.wheel); // 5

        // 인스턴스 클래스 변수를 공유하기 때문에 같은 값이 됨.

    }
}
