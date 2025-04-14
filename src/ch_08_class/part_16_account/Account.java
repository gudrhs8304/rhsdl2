package ch_08_class.part_16_account;

public class Account {
    /*
    생성자 : 생성자의 주된 목적 -> 객체를 생성할 때 초기값 입력
    생성자를 사용하지 않으면 인스턴스 변수의 개수가 동일한 줄의 코드가 필요함.

     */

    private String name; // 이름
    private String no; // 계좌번호
    private int balance; // 예금잔고

    public Account(String name, String no, int balance) {
        this.name = name;
        this.no = no;
        this.balance = balance;
    }


    @Override
    public String toString() {
        /* 객체를 출력할 때 자동으로 실행. 기존 패키지.클래스이름@주소를 대체. */
        return "계좌명의 : " + name + ", 계좌번호 : " + no + ", 예금잔고 : " + balance;
    }

}
