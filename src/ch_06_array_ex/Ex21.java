package ch_06_array_ex;

public class Ex21 {
    public static void main(String[] args) {
        /*
        길이가 5인 정수형 배열을 생성하고, 배열에 1부터 5까지 숫자를 저장한 후 이를 출력하세요.
         */

        // 1. 정수를 저장할 배열 numbers 생성
        // 2. for문을 사용해서 숫자저장
        // 3. for each문을 사용해서 출력

        // 1. 정수를 저장할 배열 numbers 생성
        int[] numbers = new int[5];

        // 2. for문을 사용해서 숫자저장
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // 3. for each문을 사용해서 출력
        for (int number : numbers){ // for each문
            System.out.print(number + " ");
        }

    }
}
