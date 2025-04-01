package ch03_operator_ex;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
        사용자로 부터 두 개의 정수를 입력받아서
        정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은 수를 계산하여 화면에 출력하는 프로그램을 작성하시오.
        큰 수와 작은 수를 구할 때는 삼항연산자를 사용하시오.

        x : 5
        y : 7
        두 수의 합: 12
        두 수의 차: -2
        두 수의 곱: 35
        두 수의 평균: 6.0
        큰 수: 7
        작은 수 : 5
         */
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.print("x: ");
        x = sc.nextInt();
        System.out.print("y: ");
        y = sc.nextInt();

        System.out.println("두 수의 합: " + (x + y));
        System.out.println("두 수의 차: " + (x - y));
        System.out.println("두 수의 곱: " + (x * y));
        System.out.println("두 수의 평균: " + (double)(x + y) / 2);
        System.out.println("큰 수: " + (x > y ? x : y));
        System.out.println("작은 수: " + (x < y ? x : y));

        sc.close();
    }
}
