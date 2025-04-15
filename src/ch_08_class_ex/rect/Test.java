package ch_08_class_ex.rect;

public class Test {
    public static void main(String[] args) {
        Rect[] list; // 참조 변수 선언

        list = new Rect[5]; // 배열 객체 생성

        //배열 요소 생성
        for(int i = 0; i < list.length; i++) {
            list[i] = new Rect(i, i);
        }

        for(int i = 0; i < list.length; i++) {
            System.out.println(i + "번째 사각형의 면적 = " + list[i].getArea());
        }
    }
}
