package ch_07_meyhod_ex;

import java.util.Scanner;

public class Ex02 {
    /*
    학생 3명의 성적을 사용자로부터 입력받고,
    입력된 점수를 배열로 저장한 후 평균을 구해 출력하는 프로그램을 작성하세요.
    점수를 입력받는 부분과 평균을 구하는 부분은 메서드로 분리하세요.

    ex)
    학생 1의 점수를 입력하세요: 80
    학생 2의 점수를 입력하세요: 90
    학생 3의 점수를 입력하세요: 85
    평균 점수: 85.0
     */

    static void inputScore(int[] scores) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("학생" + (i + 1) + "의 점수를 입력하세요: ");
            scores[i] = scanner.nextInt();
        }
    }
    static double avg(int[] scores) {
        double sum = 0;
        sum = (scores[0] + scores[1] + scores[2]) / 3.0;
        return sum;
    }
    public static void main(String[] args) {
        int student = 3;
        int[] scores = new int[student];

        inputScore(scores);
        double average = avg(scores);

        System.out.println("평균값:" + average);






    }
}
