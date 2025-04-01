package ch_04_control_ex;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*
        사용자에게 입력받은 정수가 짝수인지, 홀수인지 알려주는 코드를 완성하세요.
         */

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("정수를 입력하세요 >>> ");
        num = sc.nextInt();

        System.out.println(num % 2 == 0 ? "짝수입니다" : "홀수입니다");
        // 입력받은 정수를 2로 나눈 후에 나머지가 0이면 짝수, 1이면 홀수
        if (num % 2 == 0) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다.");
        }
        sc.close();

    }
}
