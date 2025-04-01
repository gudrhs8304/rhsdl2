package ch_04_control_ex;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
        사용자에게 성적을 입력받아 switch문을 사용해서 학점을 출력하는 코드를 완성하세요.
        입력은 0~100까지 입력이 됩니다
        *기준은 아래와 같습니다.
        A : 90 ~ 100
        B : 80 ~ 89
        C : 70 ~ 79
        D : 60 ~ 69
        F : 0 ~ 59
         */

        Scanner sc = new Scanner(System.in);
        int score;
        char grade;

        System.out.print("성적을 입력하세요 >>> ");
        score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        switch (score / 10) {
            case 9,10 -> grade = 'A';
            case 8 -> grade = 'B';
            case 7 -> grade = 'C';
            case 6 -> grade = 'D';
            default -> grade = 'F';
        }
        System.out.println("학점은 " + grade + "등급 입니다.");
        sc.close();
    }
}
