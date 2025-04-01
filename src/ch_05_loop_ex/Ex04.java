package ch_05_loop_ex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        for문을 이용해서 정수 5개를 입력받아 합을 출력하는 코드를 작성하시오.

        실행 예)
        1번째 정수를 입력해 주세요 >> 1
        2번째 정수를 입력해 주세요 >> 2
        3번째 정수를 입력해 주세요 >> 3
        4번째 정수를 입력해 주세요 >> 4
        5번째 정수를 입력해 주세요 >> 5
        5개 정수의 합은 15입니다.

        작성순서
        1) 5번 반복하는 for 반복문 작성
        2) 반복문 안에서 정수 입력
         */

        int sum = 0;
        int loopCnt = 10;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= loopCnt; i++) {
            System.out.print(i + "번째 정수를 입력해 주세요 >> ");
            sum += sc.nextInt();
        }

        System.out.println(loopCnt + "개 정수의 합은 " + sum + "입니다.");

    }
}
