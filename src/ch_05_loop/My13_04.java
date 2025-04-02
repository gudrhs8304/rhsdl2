package ch_05_loop;

import java.util.Scanner;

public class My13_04 {
    public static void main(String[] args) {
        /* My13 에서 break 사용하는 코드로 수정 */
        Scanner sc = new Scanner(System.in);
        String answer;
        int count = 0;

        while (true) {
            System.out.print("음악을 재생하시겠습니까? (Y) >> ");
            answer = sc.nextLine();

            if (!(answer.equals("Y") || answer.equals("y"))) {
                break;
            }
            System.out.println("음악을 " + ++count + "번 재생했습니다.");
        }
        System.out.println("재생종료");
        sc.close();
    }
}
