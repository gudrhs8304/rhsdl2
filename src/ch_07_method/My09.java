package ch_07_method;

import java.util.Scanner;

public class My09 {
    /*
    1. void 메서드에서는 값을 반환할 수 없지만, return; 문을 사용하여 중간에 빠르게 빠져나올 수 있음 (early exit)
     */
    static void divide(int num1, int num2) {
        // 사용자 입력값 유효성 검사 후 return으로 실행을 중단
        if (num2 == 0) {
            System.out.println("0으로는 나눌 수 없습니다.");
            return; //메서드 조기 종료
        }
        int result = num1 / num2;
        System.out.println("결과: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = scanner.nextInt();
        System.out.print("정수 b : ");
        int b = scanner.nextInt();

        divide(a, b);

        scanner.close();
        System.out.println("main 메서드 종료");
    }
}
