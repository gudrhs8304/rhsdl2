package ch_05_loop;

import java.util.Scanner;

public class My14 {
    public static void main(String[] args) {
        /*
        반복문을 빠져나오는 방법은 1) 조건식이 false 가 되거나 2) break 문이 실행.
        break문은 반복을 멈추게 함.

        반복문이 진행되다가 break문을 만나면 곧바로 반복문을 벗어나서 반복문 다음의 코드를 수행.
         */

        // 사용자가 입력한 정수를 더하는 코드
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.print("더할 숫자를 입력하세요: (종료하려면 0입력) ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("현재까지의 총합 = " + sum);

    }
}
