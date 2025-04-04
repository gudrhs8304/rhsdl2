package ch_06_array_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        키보드로 부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
        실행결과를 보고 알맞게 작성해 보세요.

        실행 예)
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 1
        학생수> 3
        [0, 0, 0]
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 2
        scores[0]> 90
        scores[1]> 80
        scores[2]> 70
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 3
        scores[0]: 90
        scores[1]: 80
        scores[2]: 70
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 4
        최고 점수: 90
        평균 점수: 80.0
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 5
        프로그램 종료
        */
        Scanner sc = new Scanner(System.in);
        boolean flag = true; // 반복문의 조건으로 사용 -> 값이 false가 된다면 반복문이 종료.
        int studentNum = 0; // 학생수
        int[] scores = null; // 점수를 입력 받을 빈 배열 생성. 사용자에게 입력받은 학생수를 기준으로 배열 생성.

        while (flag) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = sc.nextInt();
            if (selectNo == 1) {
                // 작성 위치. 학생수를 입력 받아서 배열 생성
                System.out.print("학생수> ");
                studentNum = sc.nextInt();
                scores = new int[studentNum];
                System.out.println(Arrays.toString(scores));
            }  else if (selectNo == 2) {
                    if(scores == null) {
                        System.out.println("학생수를 먼저 입력하세요.");
                        continue;
                    } else {
                        for (int i = 0; i < scores.length; i++) {
                            System.out.print("scores[" + i + "]> ");
                            scores[i] = sc.nextInt();
                        }
                    }
            } else if (selectNo == 3) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            } else if (selectNo == 4) {
                int max = -1;
                int min = 1000;
                double avg = 0;
                int total = 0;
                for(int i = 0; i < studentNum; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                    total += scores[i];
                    avg = (double)total / studentNum;
                }
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);

            } else if (selectNo == 5) {
                // 작성 위치. flag 값 변경
                flag = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
