package ch_06_array;

public class My11 {
    public static void main(String[] args) {
        /* 숫자 셔플 */
        int[] numbers = new int[10];

        // 0 1 2 3 4 5 6 7 8 9
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i; // 배열을 0 ~ 9의 숫자로 초기화 한다.
            System.out.print(numbers[i] + " "); // 0 1 2 3 4 5 6 7 8 9
        }
        System.out.println();

        // Math.random() : 0.0 이상, 1.0 미만의 double 값의 난수를 균일한 분포로 반환
        System.out.println((int) (Math.random() * 10));
        //idx range : 0 ~ 9

        for (int i = 1; i <= 10000; i++) {
            // swap
            int idx = (int) (Math.random() * 10);
            int temp = numbers[0];
            numbers[0] = numbers[idx];
            numbers[idx] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // 배열의 내용을 출력한다.
        }
    }
}
