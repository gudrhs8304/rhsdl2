package ch_04_control;

import java.util.Scanner;

public class My04 {
    public static void main(String[] args) {
        /*
        3. if ~ else if
        if (조건식1) {
            조선식1이 참일때 실행할 코드
        } else if (조건식2) {
            조건식1이 거짓이고 조건식 2가 참일때 실행할 코드
        }

        4. if ~ else if ~ else
        if (조건식1) {
            // 조건식1이 참일때 실행할 코드
        } else if {
            // 조건식 1이 거짓이고 조건식2가 참일때 실행할 코드
        } else {
            // 조건식 1, 조건식2가 모두 거짓일때 실행할 코드
        }

        * 무조건 if가 있어야 하고 제일 앞에 와야함
        * else if는 개수의 제한없이 들어갈수 있음
        * 무조건 else는 제일 뒤에 와야 함.
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
        if (age >= 20) {
            System.out.println("성인입니다.");
            System.out.println("성인요금이 적용됩니다.");
        } else if (age >=14) {
            System.out.println("청소년입니다.");
            System.out.println("청소년요금이 적용됩니다.");
        } else if (age >= 9) {
            System.out.println("어린이입니다.");
            System.out.println("어린이요금이 적용됩니다.");
        } else {
            System.out.println("유아입니다.");
            System.out.println("유아요금이 적용됩니다.");
        }
        System.out.println("결제를 진행해 주세요.");
    }
}
