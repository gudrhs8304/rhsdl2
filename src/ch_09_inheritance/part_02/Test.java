package ch_09_inheritance.part_02;

public class Test {
    public static void main(String[] args) {
        Chick chick = new Chick(); // 부모 클래스의 객체 생성
        chick.display();

        RedChick redChick = new RedChick(); // 자식 클래스의 객체 생성
        redChick.display(); // RedChick() 클래스에는 구현이 안된 메서드. 부모 클래스에서 상속 받아 사용
        System.out.println(redChick.x);
    }
}
