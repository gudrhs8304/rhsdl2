package ch_08_class.part_17_car.step_01;

public class Car {
    private String color; // 색상
    private String gearType; // 변속기 종류 - auto(자동), manual(수동)
    private int door; // 문의 갯수

    public  Car() {}
    public Car (String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;


    }
    public String toString() {
        return "Car{" + "color='" + color + '\'' + ", gearType='" + gearType + '\'' + ", door=" + door + '}';
    }
//    public void setColor(String color){
//        this.color = color;
//    }
//    public void setGearType(String gearType){
//        this.gearType = gearType;
//    }
//    public void setDoor(int door){
//        this.door = door;
//    }
}
