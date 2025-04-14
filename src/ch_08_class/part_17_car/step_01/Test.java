package ch_08_class.part_17_car.step_01;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        // setter 이용 초기화. white / auto / 4

//        car1.setColor("white");
//        car1.setGearType("auto");
//        car1.setDoor(4);

        System.out.println(car1); // 초기값 확인

        // 생성자 사용 초기화
        // black / manual / 4
        Car car2 = new Car("black","manual",4);
        System.out.println(car2);
    }
}
