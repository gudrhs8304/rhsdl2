package ch_04_control_ex;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int ranking = 1;
        char medalColor;

        // 1 -> G
        // 2 -> S
        // 3 -> B
        // etc -> A

        Scanner sc = new Scanner(System.in);
        System.out.print("등수를 입력하세요: ");

        ranking = sc.nextInt();
        // 1. if 으로 작성
        if (ranking == 1) {
            medalColor = 'G';
        } else if (ranking == 2) {
            medalColor = 'S';
        } else if (ranking == 3) {
            medalColor = 'B';
        } else {
            medalColor = 'A';
        }
        // 2. switch 로 작성
        switch (ranking) {
            case 1: // ranking 이 1일 경우 코드의 시작점
                medalColor = 'G' ;
                break;
            case 2: // ranking 이 2일 경우 코드의 시작점
                medalColor = 'S' ;
                break;
            case 3:
                medalColor = 'B' ;
                break;
            default:
                medalColor = 'A' ;
        }
        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
    }
}
