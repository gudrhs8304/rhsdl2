package ch_07_method;

public class My04 {
    /* 매개변수, 반환값 모두 없는 경우 */
    void print(){
        System.out.println("메서드를 호출한다.");
    }
    public static void main(String[] args) {
        // 사용할 메서드가 있는 클래스의 인스턴스 선언
        My04 my04 = new My04();
        my04.print();
        my04.print();
        my04.print();
    }
}
