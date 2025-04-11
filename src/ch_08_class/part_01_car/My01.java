package ch_08_class.part_01_car;

public class My01 {
    /* 만들어진 class 사용 */
    public static void main(String[] args) {
        Car car; // 클래스의 객체를 참조할 수 있는 참조변수 선언
        car = new Car(); //클래스의 객체를 생성하고 객체의 주소를 참조변수에 저장

        System.out.println("시동 처음 초기화 : " + car.powerOn); // false
        System.out.println("차의 색상 초기화 : " + car.color);
        System.out.println("바퀴의 수 초기화 : " + car.wheel);
        System.out.println("속력 초기화 : " + car.speed);
        System.out.println("와이퍼 작동 초기화 : " + car.wiperOn);

        car.power(); // 시동 메서드 실행
        System.out.println("시동 메서드 동작 : " + car.powerOn); // true
        car.power(); // 시동 메서드 실행
        System.out.println("시동 메서드 동작 : " + car.powerOn); // false

        car.color = "black"; // 색상 변수에 black 대입
        System.out.println("현재 차의 색상 : " + car.color); // black
    }
}
