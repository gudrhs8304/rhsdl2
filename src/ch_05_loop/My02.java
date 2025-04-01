package ch_05_loop;

public class My02 {
    public static void main(String[] args) {
        /* for문의 실행 순서 */

        int sum = 0; // 합을 담을 변수. 초기화가 꼭 필요.
        int i = 0;
        // for (초기화; 조건식; 증감식)
        for(i = 1; i <= 10; i++) {
            System.out.println("i = " + i + " sum = " + (sum += i));
        }
        /*
        1) 초기화 실행 -> int i = 1
        2) 조건식 확인 -> i <= 10
        3) 조건식이 참이면 명령문 실행

        4) 증감식 실행 -> i++  -> 2
        5) 조건식 확인 -> 2 <= 10
        6) 조건식이 참이면 명령문 실행

        4) 5) 6) 반복

        i -> 3
        i <= 10
        .....
        i -> 10
        10 <= 10

        i -> 11
        11 <= 10 -> false 반복문 탈출~~~
         */
        System.out.println("i = " + i + " sum = " + sum); // i는 for문에서만 유효
    }
}
