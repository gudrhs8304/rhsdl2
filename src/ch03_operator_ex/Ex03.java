package ch03_operator_ex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        사용자에게 국어, 영어, 수학 3과목의 점수(정수)를 입력받고, 평균 점수(실수)를 출력하는 프로그램을 작성하세요.

        예)
        국어 점수를 입력하세요: 89
        영어 점수를 입력하세요: 76
        수학 점수를 입력하세요: 80
        국어 점수: 89
        영어 점수: 76
        수학 점수: 80
        평균 점수: 81.666666666667
         */

        // 1. 사용할 변수 선언
        Scanner scanner = new Scanner(System.in); // 사용자에게 입력을 받기 위해 사용
        int kor, eng, math; // 국영수 점수(정수)를 저장하기 위해
        double avg; // 평균(실수)를 저장하기 위해 사용

        // 2. 점수 입력
        System.out.print("국어 점수를 입력하세요: ");
        kor = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        eng = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요:");
        math = scanner.nextInt();

        // 3. 점수 출력
        avg = (double) (kor + eng + math) / 3;
        System.out.println("국어 점수: " + kor);
        System.out.println("영어 점수: " + eng);
        System.out.println("수학 점수: " + math);
        System.out.println("평균 점수: " + avg);

        scanner.close();
    }
}
