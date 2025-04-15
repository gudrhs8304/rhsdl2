package ch_08_class_ex.rect;

public class Rect {
    /* 사각형을 나타내는 클래스 */
    private int width, height;

    public  Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return (double) width * height;
    }
}
