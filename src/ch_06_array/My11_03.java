package ch_06_array;

import java.util.Random;

public class My11_03 {
    public static void main(String[] args) {
        /*
        로또 번호 생성기
        * 로또의 특징
         */
        int[] numbers = new int[45];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " "); // 1 ~ 45
        }
        System.out.println();

        for (int i = 1; i <= 10000; i++) {
            // swap
//         Math.random() : 0.0 이상, 1.0 미만의 double 값의 난수를 균일한 분포로 반환
            int idx = (int) (Math.random() * 45);
            int temp = numbers[0];
            numbers[0] = numbers[idx];
            numbers[idx] = temp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " "); // 배열의 내용을 출력한다.
        }
    }
}
