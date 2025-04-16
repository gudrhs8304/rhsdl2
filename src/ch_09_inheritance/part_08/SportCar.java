package ch_09_inheritance.part_08;

public class SportCar extends Car{
    public int speedLimit;

    public SportCar(int speedLimit) {
        /*
        자식 클래스의 객체가 만들어지면 자식 클래스의 생성자가 자동으로 실행이 되고,
        자식 클래스의 생성자가 실행되기 전에 부모 클래스의 생성자가 자동으로 실행.
        부모 클래스의 생성자를 코딩하지 않으면, 부모 클래스의 매개변수가 없는 생성자가 자동으로 실행.
         */
        super();
        this.speedLimit = speedLimit;
    }


}
