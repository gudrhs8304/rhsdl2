package ch03_operator_ex;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
        사용자로부터 정수 하나를 입력받아, 삼항 연산자를 사용하여 입력한 수가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.
        예)
        정수를 입력하세요: 4
        짝수입니다
         */
        Scanner sc = new Scanner(System.in);

        int num1;

        System.out.print("정수를 입력하세요: ");
        num1 = sc.nextInt();

        System.out.println(num1 % 2 == 0 ? "짝수입니다" : "홀수입니다");
        sc.close();
    }
}
