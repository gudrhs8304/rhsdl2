package ch_07_method;

public class My10 {
    /*
    메서드 오버로딩
    1. C, 파이썬, 자바스크립트에는 없는 기능
    '매개변수의 1)타입 혹은 2)갯수가 다르면' '같은 이름'을 가진 메서드를 재정의 할 수 있음.

     */
    public static void main(String[] args) {
        printGreet(); //
        printGreet("안녕~!");
        printGreet("한수", "잘지내셨나요?"); // 한수님! 잘 지내셨나요?
        printGreet(3); // 안녕하세요. 3번째 보는거네요.
    }

    public static  void printGreet() {
        System.out.println("printGreet() 메서드가 실행됩니다.");
        System.out.println("안녕하세요");
    }
    public static void printGreet(String greeting) {
        // 같은 이름의 메서드가 있으나 매개변수가 없음
        System.out.println("printGreet(String greeting) 메서드가 실행됩니다.");
        System.out.println(greeting);
    }
    public static void printGreet(String name, String greeting) {
        // 매개변수가 문자열인 메서드가 있으나 갯수가 다름
        System.out.println("printGreet(String name, String greeting) 메서드가 실행됩니다.");
        System.out.println(name + "님!" + greeting);
    }
    public static void printGreet(int cnt) {
        //매개변수가 하나인 메서드가 있으나 데이터 타입이 다름
        System.out.println("printGreet(int cnt) 메서드가 실행됩니다.");
        System.out.println("안녕하세요." + cnt + "번째 보는거네요.");

    }
}
