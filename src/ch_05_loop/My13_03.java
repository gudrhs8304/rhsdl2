package ch_05_loop;

import java.util.Scanner;

public class My13_03 {
    public static void main(String[] args) {
        /* My13 에서 while문을 for문으로 수정 */
        Scanner sc = new Scanner(System.in);
        String answer = "Y";

        for (int i = 1; answer.equals("Y") || answer.equals("y"); i++) {
            System.out.print("음악을 재생하시겠습니까? >> ");
            answer = sc.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
                System.out.println("음악을 " + i + "번 재생했습니다");
            }
        }
        System.out.println("재생종료");

//        Scanner sc = new Scanner(System.in);
//        String answer = "Y"; //while이 시작될 수 있도록 응답 값을 초기화
//

//        int count = 0;
//
//        while (answer.equals("Y")) {
//            System.out.print("음악을 재생하시겠습니까? (Y) >> ");
//            answer = sc.nextLine();
//
//            if (answer.equals("Y")) {
//                System.out.println("음악을 " + ++count + "번 재생했습니다.");
//            }
//        }
//        System.out.println("재생종료");
//        sc.close();
    }
}
