package ch_09_inheritance_ex02;

public class SportCar extends Car{
    public SportCar(String maker, String model, String color, int curSpeed) {
        super(maker, model, color, curSpeed);
    }

    @Override
    public void speedUp() {
        curSpeed += 10;
    }

    @Override
    public void speedDown() {
        curSpeed -= 10;
    }
    public int getCurSpeed() {
        return curSpeed;
    }
    public String getModel() {
        return model;
    }
}
