package ch_06_array_ex;

public class Ex22 {
    public static void main(String[] args) {
        /*
        다음 배열에서 가장 큰 수와 가장 작은 수를 찾아 출력하는 프로그램을 작성하세요.
        int[] numbers = { 45, 22, 78, 10, 55};

        가장 큰 수: 78
        가장 작은 수: 10

        작업 순서
        1. 변수 선언
        2. for문을 사용해서 최댓값 출력
        3. for each문을 사용해서 최솟값 출력
         */

        int[] numbers = new int[5];
        numbers[0] = 45;
        numbers[1] = 22;
        numbers[2] = 78;
        numbers[3] = 10;
        numbers[4] = 55;

        int max = numbers[0];
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }

        }
        System.out.println("가장 큰 수: " + max);

        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println("가장 작은 수: " + min);





    }
}
