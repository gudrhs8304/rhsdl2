package ch_05_loop_ex;

public class Ex08 {
    public static void main(String[] args) {
        /*
        3개의 주사위를 던지는 게임이 있다고 가정하자.
        중첩 for문을 이용하여 3개의 주사위의 합이 6이 되는 경우를 출력하는 프로그램 작성.
         */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++){
                for (int k = 1; k <= 6; k++) {
                    if (i + j + k == 6) {
                        System.out.println("3개의 주사위의 합이 6이 되는 경우: (" + i + ", " + j + ", " + k + ")");
                    }
                }
            }
        }
    }
}
