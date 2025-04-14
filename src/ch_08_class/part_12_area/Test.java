package ch_08_class.part_12_area;

public class Test {
    public static void main(String[] args) {
        /*
        클래스 메서드는 객체를 생성하지 않아도 호출이 가능.
        인스턴스 메서드는 객체를 생성해야만 호출이가능.
        왜나하면 인스턴스 메서드는 객체가 생성되어야 메모리상(힙 영역)에 실제로 존재하고
        클래스 메서드는 클래스가 메모리에 올라갈 때 생성(데이터 영역)되기 때문.
         */
        Area.manual(); // 클래스 메서드 접근 가능
        //Area.triangle(); // 에러발생

        Area area = new Area();
        Area.manual(); // 가급적 클래스 단위로 메서드 호출하는 것이 좋음.
        System.out.println(area.triangle(3,5));
        System.out.println(area.rectangle(3,4));

    }
}
