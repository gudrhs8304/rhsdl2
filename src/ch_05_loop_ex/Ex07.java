package ch_05_loop_ex;

public class Ex07 {
    public static void main(String[] args) {
        /*
        2개의 주사위를 던지는 게임이 있다고 가정하자.
        중첩 for문을 이용하여 2개의 주사위의 합이 6이 되는 경우를 출력하는 코드 작성.
         */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.println("2개의 주사위의 합이 6이 되는 경우: (" + i + ", " + j + ")");
                }
            }
        }
    }
}
