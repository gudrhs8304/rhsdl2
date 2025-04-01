package ch_05_loop;

public class My01 {
    public static void main(String[] args) {
        /*
        반복문의 종류로는 for문, while문, do~while문이 있음.
        for문과 while문은 서로 변환이 가능하기 때문에
        반복문을 작성할 때 어느 쪽을 선택해도 좋지만,
        for문은 반복 횟수를 알고 있을 때 주로 사용하고,
        while문은 조건에 따라 반복할 때 주로 사용.
         */

        /*
        반복문이 필요한 이유
        예) 1 부터 10까지 더한 합을 구함.
         */
        int num = 1;
        num += 2;
        num += 3;
        num += 4;
        num += 5;
        num += 6;
        num += 7;
        num += 8;
        num += 9;
        num += 10;

        System.out.println("1부터 10까지의 합은 " + num + "입니다.");

        int sum = 0; // 합계
        for (num = 1; num <= 10; num++) {
            sum += num;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
