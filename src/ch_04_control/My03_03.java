package ch_04_control;

import java.util.Scanner;

public class My03_03 {
    public static void main(String[] args) {
        /*
        삼항 연산자를 사용하는 방식으로 변경
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.println(age >= 19 ? "성인입니다\n성인요금이 적용됩니다" : "청소년입니다\n청소년요금이 적용됩니다");

//        if (age >= 19) {
//        // 19세 이상이면 실행
//            System.out.println("성인입니다");
//            System.out.println("성인요금이 적용됩니다");
//        } else {
//            System.out.println("청소년입니다");
//            System.out.println("청소년요금이 적용됩니다");
//        }
        System.out.println("결제를 진행해 주세요");
    }
}
