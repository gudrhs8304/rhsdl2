package ch_08_class.part_01_car;

public class My02 {
    public static void main(String[] args) {
        // 같은 클래스를 가지고 만든 두 객체는 구조는 동일하지만 서로 다른 저장공간을 가짐.
        Car car1 = new Car(); // car1 인스턴스 생성
        Car car2 = new Car(); // 인스턴스 하나 더 생성

        car1.color = "red";
        car2.color = "black";
        System.out.println("car1의 색 : " + car1.color); // red
        System.out.println("car2의 색 : " + car2.color); // black

        car1.speedUp();
        System.out.println("car1의 속도 : " + car1.speed); // 1
        System.out.println("car2의 속도 : " + car2.speed); // 0

        car2.wiper();
        System.out.println("car1의 속도 : " + car1.wiperOn); // false
        System.out.println("car2의 속도 : " + car2.wiperOn); // true
    }
}
