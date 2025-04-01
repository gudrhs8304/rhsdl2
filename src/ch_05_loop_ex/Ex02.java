package ch_05_loop_ex;

public class Ex02 {
    public static void main(String[] args) {
        /*
        for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해 보세요.
        ex) 3, 6, 9, 12,,,,

        작업 순서
        1) 1부터 100까지의 정수를 합하는 코드 작성
        2) 코드를 3의 배수의 합을 구하는 코드로 변경
         */

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지 정수의 합: " + sum);

        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("1부터 100까지 정수 중 3의 배수의 합: " + sum);

        sum = 0;

        for (int i = 3; i <= 100; i += 3) { // 반복의 횟수가 적어서 시간복잡도가 적은 코드
            sum += i;
        }
        System.out.println("1부터 100까지 정수 중 3의 배수의 합: " + sum);

    }
}
