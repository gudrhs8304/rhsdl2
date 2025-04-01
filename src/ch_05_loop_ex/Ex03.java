package ch_05_loop_ex;

public class Ex03 {
    public static void main(String[] args) {
        /*
        1부터 100사이의 정수 중에서 3 또는 4의 배수의 합을 구하는 코드를 작성
         */

        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println("1부터 100사이의 정수 중 3또는 4의 배수의 합: " + sum);

    }
}
