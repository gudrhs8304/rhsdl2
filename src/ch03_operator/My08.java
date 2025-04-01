package ch03_operator;

public class My08 {
    public static void main(String[] args) {
        /*
        비교 연산자.
        비교를 해서 참인지 거짓인지 확인하는게 목적.
        결과 값은 true or false.
         */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        System.out.println(num1 < num2); // 10 < 20
        System.out.println(num1 > num2); // 10 > 20
        // 산술연산자가 비교연산자 보다 먼저 실행.
        System.out.println(num1 + num2 <= num3); // 30 <= 30
        System.out.println(num1 + num2 >= num3); // 30 >= 30

    }
}
