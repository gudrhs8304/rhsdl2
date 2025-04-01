package ch_05_loop_ex;

public class Ex01 {
    public static void main(String[] args) {
        /*
        for문을 사용해서 10 부터 15까지의 합을 구하고 출력
         */

        int sum = 0; // 합계를 저장할 변수. 초기화가 꼭 필요

        for (int i = 10; i <= 15; i++) { // 반복을 위한 변수명은 꼭 i를 사용
            sum += i; // sum = sum + i;
        }
        System.out.println("10부터 15까지의 합: " + sum);
    }
}
