package ch_05_loop;

public class My05 {
    public static void main(String[] args) {
        /*
        for문은 또 다른 for문을 내포할 수 있는데, 이것을 중첩 for문이라고 함.

        이 경우 바깥쪽 for문이 한 번 실행할 때마다 중첩된 for문은 지정된 횟수만큼
        반복해서 돌다가 다시 바깥쪽 for문이 돌아감.
         */
        // 중첩 for문으로 구구단 출력

        // 6 * 5 = 30
        // dan : 2 ~ 9
        // time : 1 ~ 9
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("*** " + dan + "단 ***");
            for (int time = 1; time <= 9; time++) {
                System.out.println(dan + " x " + time + " = " + (dan * time));
            }
            System.out.println();
        }
    }
}
