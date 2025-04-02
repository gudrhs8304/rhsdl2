package ch_05_loop_ex.ex_while;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        프로그램이 가지고 있는 정수를 사용자가 알아맞히는 게임.
        1) 1부터 1000 사이의 정수 하나를 생성한다.
        2) 사용자가 답을 추측하여 입력한다.
        3) 정답이 아닐 경우 정답이 입력한 값보다 큰지 혹은 작은지 알려준다.
        4) 정답일 경우, 성공 메시지 및 시도 횟수 출력할 것.

        정답을 추측하여 보시오: 500
        제시한 정수가 높습니다.
        정답을 추측하여 보시오: 250
        제시한 정수가 낮습니다.
        정답을 추측하여 보시오: 375
        제시한 정수가 낮습니다.
        정답을 추측하여 보시오: 435
        제시한 정수가 높습니다.
        정답을 추측하여 보시오: 410
        제시한 정수가 높습니다.
        정답을 추측하여 보시오: 393
        제시한 정수가 낮습니다.
        정답을 추측하여 보시오: 400
        제시한 정수가 낮습니다.
        정답을 추측하여 보시오: 405
        축하합니다. 시도횟수 = 8
         */

        /*
        반복문에서 종료 조건을 상단에 배치하는 이유
        * 가독성 증가: 반복문이 언제 종료되는지 명확히 보여줍니다.
        * 불필요한 연산 방지: 조건이 만족되지 않으면 반복문 내부를 실행하지 않아 성능 최적화가 가능합니다.
        * 코드 유지보수 용이 : 조건 변경시 쉽게 수정할 수 있습니다
         */
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = random.nextInt(1000) + 1;
        int count = 0;

        while (true) {
            System.out.print("정답을 추측하여 보시오: ");
            int answer = sc.nextInt();
            count++;
            if (answer == score) {
                System.out.println("축하합니다. 시도횟수 = " + count);
                break;
            } else if (answer > score) {
                System.out.println("제시한 점수가 높습니다.");
            } else {
                System.out.println("제시한 점수가 낮습니다.");
            }
        }
    }
}
