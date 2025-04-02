package ch_05_loop;

import java.util.Scanner;

public class My13_05 {
    public static void main(String[] args) {
        /* My13 에서 사용자에게 Y, N 만 입력받도록 수정 */
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String answer;

        while (true) {

            while (true) {
                System.out.print("음악을 재생하시겠습니까? (Y/N) >> ");
                answer = sc.nextLine();

                if (answer.equals("Y") || answer.equals("N")) {
                    break;
                }
            }
            if (answer.equals("N")) break;
            System.out.println("음악을 " + ++count + "번 재생했습니다.");
        }
        System.out.println("재생종료");
        sc.close();
    }
}
