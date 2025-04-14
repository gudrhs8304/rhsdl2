package ch_08_class.part_13_check;

public class Check {
    /*
    클래스 메서드에서 인스턴스 변수에 접근할 수 없음.

    iv : intstanceVariable
    cv : classVarialble
    im : instanceMethod
    cm : classMethod
     */
    static int cv = 5; // 클래스 변수
    int iv = 4; // 인스턴스 변수

    static void cm() {} // 클래스 메서드

    void im() {} // 인스턴스 메서드

    // 4가지 case
    void imInstanceMember() {
        // 인스턴스 메서드가 인스턴스 멤버에 접근
        System.out.println(iv);
        im();
    }

    void imClassMember() {
        // 인스턴스 메서드가 클래스 멤버에 접근
        System.out.println(cv);
        cm();
    }
    static void cmInstanceMember() {
       // 클래스 메서드가 인스턴스 멤버에 접근
//        System.out.println(iv);
//        im();
    }

    static void cmClassMember() {
        // 클래스 메서드가 클래스 멤버에 접근
        System.out.println(cv);
        cm();
    }
}
