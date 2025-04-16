package ch_09_inheritance_ex01;

public class Vehicle {
    /*
    Car, Truck, Bus 클래스의 공통 부분을 가지는 부모 클래스 Vehicle를 작성
     */
    public int heading;
    public int speed;

    public void turn(int angle) {
        heading = angle;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
