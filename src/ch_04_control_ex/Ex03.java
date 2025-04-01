package ch_04_control_ex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        시험 점수(0~100)를 입력받아 아래 기준에 따라 등급을 출력하는 프로그램을 작성하세요.
            90점 이상 : A
            80점 이상 90점 미만: B
            70점 이상 80점 미만: C
            60점 이상 70점 미만: D
            60점 미만 : F
         예)
         점수를 입력하세요: 85
         B등급 입니다.
         */

        Scanner sc = new Scanner(System.in);
        int score;
        String grade;

        System.out.print("점수를 입력하세요: ");
        score = sc.nextInt();

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println(grade + "등급 입니다.");

        sc.close();
    }
}
