package ch_04_control;

import java.util.Scanner;

public class My08_01 {
    public static void main(String[] args) {
        /*
        월을 입력하면 입력한 월이 몇일까지 있는지 알려주는 코드
        1) 31
        1, 3, 5, 7, 8, 10, 12
        2) 30
        4, 6, 9, 11
        3) 28
        2
         */

        Scanner sc = new Scanner(System.in);
        int month, day;

        System.out.print("월을 입력해 주세요 >>> ");
        month = sc.nextInt();

        /* Java 12 부터 개선된 switch 문을 지원 */
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
            case 4, 6, 9, 11 -> day = 30;
            case 2 ->  day = 28;
            default  -> {
                day = 0;
                System.out.println("존재하지 않는 달 입니다.");
            }
        }

        System.out.println(month + "월은 " + day + "일까지 있습니다.");
        sc.close();
    }
}
