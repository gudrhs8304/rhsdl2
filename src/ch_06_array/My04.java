package ch_06_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class My04 {
    public static void main(String[] args) {
        // 길이가 5인 배열 생성. 생성 및 초기화를 동시에 할때는 배열 길이 생략
        int[] numbers = new int[]{10, 20, 4, 25, 18};

        // 길이가 7인 배열 생성, new int[] 생략 가능
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7};

        // for문으로 배열 초기화
        int[] numbers3 = new int[10];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = i + 1;
        }

        // 배열의 요소를 출력(순회)하는 방법 3가지.
        // 1. for 문을 이용한 출력
        System.out.println(numbers3.length - 1);
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        // 2. foreach 문을 이용한 출력
        System.out.println();
        for (int number : numbers3) { // (배열의 요소 : 배열)
            System.out.println(number);
        }

        // 3. Arrays.toSting 매서드 사용. 문자열로 출력.
        System.out.println();
        System.out.println(Arrays.toString(numbers3));

        // 4. stream() 사용
        Arrays.stream(numbers3).forEach(System.out::println);

    }
}
