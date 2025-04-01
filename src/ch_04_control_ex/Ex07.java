package ch_04_control_ex;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
        사용자로부터 1월부터 12월 사이의 숫자(월)을 입력받아.
        해당 월이 어떤 계절에 속하는지 출력하는 프로그램을  switch 를 사용하여 작성하세요.
        계절 기준:
            봄 (Spring) : 3월, 4월, 5월
            여름 (Summer): 6월, 7월, 8월
            가을 (Fall) : 9월 10월, 11월
            겨울 (Winter) : 12월 1월 2월

        입력값이 1~12 사이가 아니면 "잘못된 입력입니다."를 출력하세요
        예)
        월을 입력하세요: 7
        여름입니다.
         */
        Scanner sc = new Scanner(System.in);
        int month;

        System.out.print("월을 입력하세요: ");
        month = sc.nextInt();

        switch (month / 3) {
            case 1:
                System.out.println("봄 입니다.");
                break;
            case 2:
                System.out.println("여름 입니다.");
                break;
            case 3:
                System.out.println("가을 입니다.");
                break;
            default:
                System.out.println("겨울 입니다.");
        }
    }
}
