package ch_04_control;

import java.util.Scanner;

public class My01_02 {
    public static void main(String[] args) {
        /*
        1. if  단독
         if (조건식) {
               // 조건식이 참일때 실행할 코드
         }
         */
        Scanner sc = new Scanner(System.in);
        //int num = 3;
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        System.out.println(num > 3 ? "num은 3보다 큽니다" : "");
        // 조건이 맞을 시에 실행할 문장이 하나이면 중괄호 생략 가능 -> 하지만 비추천
//        if (num > 3)  // if (조건식)
//            System.out.println(num +"은 3보다 큽니다.");
          // if 구문의 끝

        // 조건식과 상관없이 무조건 실행
        System.out.println("검사가 끝났습니다");

    }
}
