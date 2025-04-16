package ch_09_inheritance_ex02;

public class Car {
//    속성 : 제조사(maker), 모델 이름(model), 색상(color), 현재 속도(curSpeed)
//    행위 : 가속(speedUp), 감속(speedDown)
    public String maker, model, color;
    public int curSpeed;

    public Car(String maker, String model, String color, int curSpeed){
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.curSpeed = curSpeed;
    }
    public void speedUp(){
        curSpeed++;
    }
    public void speedDown(){
        curSpeed--;
    }

    public int getCurSpeed() {
        return curSpeed;
    }
    public String getModel() {
        return model;
    }


}
