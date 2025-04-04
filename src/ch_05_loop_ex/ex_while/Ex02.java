package ch_05_loop_ex.ex_while;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
         /*
            컴퓨터가 주사위를 던지면 사용자가 주사위의 숫자를 맞히는 프로그램을 완성하세요.
            사용자가 맞힐 때까지 게임은 계속 됩니다.

            * int nextInt(int n)	int 타입의 0 ~ 매개값미만 까지의 난수를 리턴.
            Random random = new Random();
            answer = random.nextInt(6) + 1;

            예)
            주사위 값은 얼마일까요? >>> 5
            오답입니다. 다시 시도하세요.
            주사위 값은 얼마일까요? >>> 1
            1! 정답입니다.
          */
        /*
        1. while으로 반복을 돌고 정답이면 break를 실행하여 반복문을 빠져나옴
        2. 반복되는 문장 중 하나는 "주사위 값은 얼마일까요? >>>
         */
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int current = random.nextInt(6) + 1; //1 ~ 6
        System.out.println(current);
        while (true) {
            System.out.print("주사위 값은 얼마일까요? >>> ");
            int answer = sc.nextInt();

            if (answer == current) {
                System.out.println(answer + "! 정답입니다.");
                break;
            }
            System.out.println("오답입니다. 다시 시도하세요.");

        }


    }
}
