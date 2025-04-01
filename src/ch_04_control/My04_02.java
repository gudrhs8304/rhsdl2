package ch_04_control;

import java.util.Scanner;

public class My04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String grade;

        System.out.print("나이를 입력하세요 >>> ");
        age = sc.nextInt();


        if (age <= 8) {
           grade = "유아";
        } else if (age <= 13) {
            grade = "어린이";
        } else if (age <= 19) {
            grade = "청소년";
        } else {
            grade = "성인";
        }
        System.out.println(grade + "입니다.");
        System.out.println(grade + "요금이 적용됩니다.");

        System.out.println("결제를 진행해 주세요.");
        sc.close();
    }
}
