package ch_05_loop;

public class My15 {
    public static void main(String[] args) {
        /*
        continue문은 현재의 반복을 뛰어넘고 다음 반복을 진행.
        반복문이 진행되다가 continue문을 만나면 반복문의 제일 끝으로 가서 다음 반복을 계속 수행.
         */

        /* 0 ~ 100까지의 홀수만 더 함 */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("0부터 100까지의 홀수의 합은 " + sum + "입니다.");
    }
}
