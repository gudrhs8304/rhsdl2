package ch_05_loop;

public class My11 {
    public static void main(String[] args) {
        /*
        while문은 조건식이 true일 경우 계속 반복.
        조건식에는 비교 또는 논리 연산식이 주로 오는데,
        조건식이 false가 되면 반복 행위를 멈추고 while문을 종료
         */

        /* 1부터 10까지 출력 */
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }
}
