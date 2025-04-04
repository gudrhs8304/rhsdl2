package ch_06_array_ex;

public class Ex01 {
    public static void main(String[] args) {
        /* for문을 이용해서 arr 배열의 합을 구하세요 */
        int[] scores = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("sum= " + sum);

        System.out.println();
        for (int score : scores) {
            score += score;
        }
        System.out.println("sum= " + sum);
    }
}
