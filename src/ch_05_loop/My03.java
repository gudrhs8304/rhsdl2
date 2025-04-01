package ch_05_loop;

public class My03 {
    public static void main(String[] args) {
        /*
        * for문 동작 시간 구하기
        프로그램의 동작 시간을 구하는 방법은
        프로그램 시작 위의 부분에서 시작시간을 구하고,
        프로그램이 끝나는 부분에서 종료시간을 구한후
        종료시간에서 시작시간을 빼면 프로그램이 동작한 시간을 구할수 있음.
         */
        // System.currentTimeMillis() : 1970년 1월 1일 0시 0분 0초부터 현재까지 흐른 시간을 구해줌.

        long start = System.currentTimeMillis(); //시작시간
        for (int i = 1; i <= 1_000_000_000; i++) { //10억번 반복
            ; //빈문장 실행
        }

        long end = System.currentTimeMillis(); //종료시간
        System.out.println("시작시간 : " + start);
        System.out.println("시작시간 : " + end);
        System.out.println("소요시간 : " + (end - start));
    }
}
