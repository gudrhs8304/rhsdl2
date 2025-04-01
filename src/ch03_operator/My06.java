package ch03_operator;

import java.util.Scanner;

public class My06 {
    public static void main(String[] args) {
        /*
        콘솔에서 입력을 받을 때는 Scanner 클래스 사용
         */
        Scanner scanner = new Scanner(System.in);
        int x, y, sum;

        System.out.print("첫 번째 숫자를 입력하시오: ");
        x = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하시오: ");
        y = scanner.nextInt();

        // 합을 출력
        sum = x + y;
        System.out.println("합: " + sum);

        scanner.close();
    }
}
