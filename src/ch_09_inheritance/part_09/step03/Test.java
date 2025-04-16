package ch_09_inheritance.part_09.step03;
/* 상속과 멤버 변수 */


class Parent {
    public int x = 10;
}

class Child extends Parent{
    public int x = 20;
    public void method(){
        int x = 30;
        System.out.println("x : " + x);
        System.out.println("this.x : " + this.x);
        /*
        super : 상속을 하면 자식의 멤버(변수, 메서드)와 이름이 겹치게 될 때가 있는데
        이를 구분하기 위해 super.변수 super.메서드()를 사용하면
        자식의 멤버가 호출되지 않고 상속받은 부모의 멤버를 호출
         */
        System.out.println("super.x : " + super.x);
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }

}
