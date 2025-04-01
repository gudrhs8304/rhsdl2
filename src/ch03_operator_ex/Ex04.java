package ch03_operator_ex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        사용자에게 세 명의 키(실수)를 입력 받아서, 평균키를 출력하는 프로그램을 작성하세요.
        예)
        첫 번째 사람의 키(cm): 170.5
        두 번째 사람의 키(cm): 165.0
        세 번째 사람의 키(cm): 180.2
        평균 키: 171.9cm
         */
        Scanner scanner = new Scanner(System.in);
        double first, second, third, avg;

        System.out.print("첫 번째 사람의 키(cm): ");
        first = scanner.nextDouble();
        System.out.print("두 번째 사람의 키(cm): ");
        second = scanner.nextDouble();
        System.out.print("세 번째 사람의 키(cm): ");
        third = scanner.nextDouble();

        avg = (first + second + third) / 3;
        System.out.println("평균 키: " + avg);

        scanner.close();

    }
}
