package ch_05_loop_ex.ex_while;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        /*
        while문과 Random.nextInt() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
        눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해 보세요.
        눈의 합이 5가 되는 조합은 (1, 4), (4, 1), (2, 3), (3, 2)입니다.
         예 )
        (5, 1)
        (4, 4)
        (6, 5)
        (5, 2)
        (3, 6)
        (1, 2)
        (2, 3)

        * int nextInt(int n)	int 타입의 0 ~ 매개값미만 까지의 난수를 리턴.
        Random random = new Random();
        answer = random.nextInt(6) + 1;
         */
        Random random = new Random();
        // random.nextInt : 0 이상 bound 미만의 정수를 랜덤으로 생성
        System.out.println(random.nextInt(6));
        System.out.println(random.nextInt(6) + 1);

        while (true) {
            int num1 = random.nextInt(6) + 1;
            int num2 = random.nextInt(6) + 1;
            System.out.println("(" + num1 + ", " + num2 + ")");
            if (num1 + num2 == 5) {
                break;
            }
        }
    }
}
