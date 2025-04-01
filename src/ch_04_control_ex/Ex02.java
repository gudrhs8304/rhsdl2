package ch_04_control_ex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
        사용자에게 입력받은 정수가 양수인지, 0 인지 음수인지 알려주는 코드를 완성하세요.
         */

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("정수를 입력하세요 >>> ");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수입니다");
        } else if (num == 0) {
            System.out.println("0 입니다");
        } else {
            System.out.println("음수입니다");
        }
        sc.close();
    }
}
