package ch_05_loop_ex;

import java.util.Scanner;

public class Ex09_a {
    public static void main(String[] args) {
        /*
        while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 완성하세요.
        프로그램을 실행하면 다음과 같은 실행 결과가 나와야 합니다. (Scanner의 nextLine() 사용).

        실행 예
        -------------------------------------
        1. 예금 | 2.출금 | 3.잔고 | 4.종료
        -------------------------------------
        선택> 1
        예금액> 10000

        -------------------------------------
        1. 예금 | 2.출금 | 3.잔고 | 4.종료
        -------------------------------------
        선택> 2
        출금액> 2000

        -------------------------------------
        1. 예금 | 2.출금 | 3.잔고 | 4.종료
        -------------------------------------
        선택> 3
        잔고> 8000

        -------------------------------------
        1. 예금 | 2.출금 | 3.잔고 | 4.종료
        -------------------------------------
        선택> 4

        프로그램 종료
         */
        boolean flag = true;
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");

            /* 코드 시작 */
            int menuNum = Integer.parseInt(sc.nextLine());
            switch (menuNum) {
                case 1 :
                    balance += Integer.parseInt(sc.nextLine());
                    System.out.print("예금액> " + balance + "\n");
                    break;
                case 2:
                    balance -= Integer.parseInt(sc.nextLine());
                    System.out.println("출금액> " + balance + "\n");
                    break;
                case 3 :
                    System.out.print("잔고> " + balance + "\n");
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다.");

            }



            /* 코드 종료 */
        }
        System.out.println("프로그램 종료");
        sc.close();
    }
}
