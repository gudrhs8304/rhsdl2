package ch_06_array_ex;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        /*
        정수형 배열을 선언하고 사용자로부터 5개의 정수를 입력받아 배열에 저장한 뒤.
        배열에 저장된 숫자들의 합과 평균을 출력하세요.
        예) 숫자입력: 10 20 30 40 50
        합계: 150
        평균 30

        작업 순서
        1. 사용할 변수 선언
        2. for문을 이용해서 사용자에게 숫자를 입력
        3. foreach 문을 이용해서 합계 구함
        4. 평균을 연산 후 출력
         */

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;
        double avg;

        System.out.print("숫자 입력: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int number : numbers) {
            total += number;
        }
        avg = (double) total / numbers.length;
        System.out.println("합계: " + total);
        System.out.printf("평균: " + avg);


    }
}
