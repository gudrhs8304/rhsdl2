package ch_04_control_ex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        사용자로부터 1월부터 12월 사이의 숫자(월)을 입력받아.
        해당 월이 어떤 계절에 속하는지 출력하는 프로그램을 작성하세요.
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
        String season;

        System.out.print("월을 입력하세요: ");
        month = sc.nextInt();

        if (month >= 3 && month <= 5) {
            season = "봄(Spring)";
        } else if (month >= 6 && month <= 8) {
            season = "여름(Summer)";
        } else if (month >= 9 && month <= 11) {
            season = "가을(Fall)";
        } else if (month >= 1) {
            season = "겨울(Winter)";
        } else {
            season = "잘못된 입력";
        }
        System.out.println(season + "입니다.");
        sc.close();
    }
}
