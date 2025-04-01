package ch_04_control_ex;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // 일년 동안 읽은 책 수에 따라 멘트를 출력
        // 10권 미만 -> 조금 더 노력 하세요!
        // 10이상 20권 미만, 10~19 책 읽는 것을 즐기는 분이시네요!
        // 20이상 30권 미만, 20~29 책을 사랑하는 분이시네요!
        // 30권 이상 -> 당신은 다독왕입니다!

        Scanner sc = new Scanner(System.in);
        int book;

        System.out.print("읽은 책의 수를 입력하세요: ");
        book = sc.nextInt();

        if (book < 10) {
            System.out.println("조금 더 노력 하세요!");
        } else if (book < 20) {
            System.out.println("책 읽는 것을 즐기는 분이시네요!");
        } else if (book < 30) {
            System.out.println("책을 사랑하는 분이시네요!");
        } else {
            System.out.println("당신은 다독왕입니다!");
        }

        switch (book / 10) {
            case 0:
               System.out.println("조금 더 노력 하세요!");
                break;
            case 1:
                System.out.println("책 읽는 것을 즐기는 분이시네요!");
                break;
            case 2:
                System.out.println("책을 사랑하는 분이시네요!");
                break;
            default:
                System.out.println("당신은 다독왕입니다!");
        }
    }
}
