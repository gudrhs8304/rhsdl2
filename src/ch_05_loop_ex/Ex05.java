package ch_05_loop_ex;

public class Ex05 {
    public static void main(String[] args) {
        /*
        1부터 5사이에 존재하는 모든 정수를 역순으로 출력하는 프로그램을 구현하세요.
        5
        4
        3
        2
        1
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println("1부터 5까지 정수출력: " + i);
        }

        for (int i = 5; i >= 1; i--) {
            System.out.println("1부터 5까지 정수역순 출력: " + i);
        }

    }
}
