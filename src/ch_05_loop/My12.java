package ch_05_loop;

public class My12 {
    public static void main(String[] args) {
        /*
        for문을 while문으로 변경
         */
        // 1. for 문으로 1 ~ 10까지 합계
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

        // 2. while 문으로 1 ~ 10까지 합계
        // while문도 초기값, 조건식, 증감식이 존재
        int total = 0;
        int num = 1;

        while (num <= 10) {
            total += num++;
        }
        System.out.println("1부터 10까지의 합은 " + total + "입니다.");
    }
}
