package ch_04_control;

import java.util.Scanner;

public class My03_02 {
    public static void main(String[] args) {
        /*
        사용자에게 나이를 입력받는 방식으로 변경
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        if (age >= 19) {
        // 19세 이상이면 실행
            System.out.println("성인입니다");
            System.out.println("성인요금이 적용됩니다");
        } else {
            System.out.println("청소년입니다");
            System.out.println("청소년요금이 적용됩니다");
        }
        System.out.println("결제를 진행해 주세요");
    }
}
