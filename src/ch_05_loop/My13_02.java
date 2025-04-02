package ch_05_loop;

import java.util.Scanner;

public class My13_02 {
    public static void main(String[] args) {
        /* My13 에서 소문자 y를 입력 받더라도 재생이 되도록 수정 */

        Scanner sc = new Scanner(System.in);
        String answer = "Y"; //while이 시작될 수 있도록 응답 값을 초기화
        int count = 0;

        while (answer.equals("Y")) {
            System.out.print("음악을 재생하시겠습니까? (Y) >> ");
            answer = sc.nextLine();
            answer = answer.toUpperCase(); // 입력받은 문자열을 대문자로 변경

            if (answer.equals("Y")) {
                System.out.println("음악을 " + ++count + "번 재생했습니다.");
            }
        }
        System.out.println("재생종료");
        sc.close();
    }
}
