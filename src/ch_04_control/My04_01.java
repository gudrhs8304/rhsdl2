package ch_04_control;

import java.util.Scanner;

public class My04_01 {
    public static void main(String[] args) {
        /*
        조건 검사를 나이적은 순서로 변경
         */
        /*
        놀이공원의 요금 나이 기준
        성인 : 20세 이상
        청소년 : 14 ~ 19
        어린이 : 9 ~13
        유아 0 ~ 8
         */

        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("나이를 입력하세요 >>> ");
        age = sc.nextInt();

        // 조건이 거짓이면 다음 조건으로 넘어감.
        // 조건이 참이 되면 다음 조건을 검사하지 않음.
        if (age <= 8) {
            System.out.println("유아입니다.");
            System.out.println("유아요금이 적용됩니다.");
        } else if (age <= 13) {
            System.out.println("어린이입니다.");
            System.out.println("어린이요금이 적용됩니다.");
        } else if (age <= 19) {
            System.out.println("청소년입니다.");
            System.out.println("청소년요금이 적용됩니다.");
        } else {
            System.out.println("성인입니다.");
            System.out.println("성인요금이 적용됩니다.");
        }

        System.out.println("결제를 진행해 주세요.");
        sc.close();
    }
}
