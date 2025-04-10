package ch_07_meyhod_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true; // 반복문의 조건으로 사용 -> 값이 false가 된다면 반복문이 종료.
        int[] scores = null; // 점수를 입력 받을 빈 배열 생성. 사용자에게 입력받은 학생수를 기준으로 배열 생성.
        while (flag) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = sc.nextInt();
            if (selectNo == 1) {
                scores = inputstudentNum();
            } else if (selectNo == 2) {
                inputScores(scores);
            } else if (selectNo == 3) {
                printScores(scores);
            } else if (selectNo == 4) {
                printAnalyze(scores);

            } else if (selectNo == 5) {
                flag = setRun();
            }
        }
        System.out.println("프로그램 종료");
    }

    static int[] inputstudentNum() {
        int studentNum = 0; // 학생수
        System.out.print("학생수> ");
        studentNum = sc.nextInt();
        int[] scores = new int[studentNum];
        System.out.println(Arrays.toString(scores));
        return scores;
    }

    static void inputScores(int[] scores) {
        if (scores == null) {
            System.out.println("학생수를 먼저 입력하세요.");
            return;
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.print("scores[" + i + "]> ");
            scores[i] = sc.nextInt();
        }
    }

    static void printScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
        }
    }

    static void printAnalyze(int[] scores) {
        int max = scores[0];
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
            total += scores[i];
        }
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + (double) total / scores.length);
    }

    static boolean setRun() {
        return false;
    }
}
