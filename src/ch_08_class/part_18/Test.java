package ch_08_class.part_18;

class A {
    private int a; //전용
    int b; // 디폴트
    public int c; // 공용
}
    public class Test {

    public static void main(String[] args) {
        A obj = new A();

//        obj.a = 10; // 전용 멤버는 다른클래스에서 접근이 안됨
        obj.b=20; // 디폴트 멤버는 접근할 수 있음
        obj.c=30; // 공용 멤버는 접근할 수 있음
    }
}
