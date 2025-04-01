package ch03_operator;

public class My11 {
    public static void main(String[] args) {
        // 논리 연산자
        int num1 = 10;

        // 비교연산자가 논리연산자 보다 먼저 실행
        System.out.println(5 < num1 && num1 < 15); // true
        // trie && true -> true

        System.out.println((5 < num1 && num1 < 15) && num1 % 2 == 0); // true
        // (5 < num1 && num1 <15) : true && true -> true
        // num1 % 2 == 0 : true
        // true && true -> true

        num1 = 4;
        System.out.println((5 < num1 && num1 < 15) && num1 % 2 == 0); // false
        // (5 < num1 && num1 < 15) : false && true -> false
        // num1 % 2 == 0 : true
        // false && true -> false

        System.out.println((5 < num1 && num1 < 15) || num1 % 2 == 0); //true
        // (5 < num1 && num1 < 15) : false || true -> true
        // num1 % 2 == 0 : true
        // true && true -> true

    }
}
