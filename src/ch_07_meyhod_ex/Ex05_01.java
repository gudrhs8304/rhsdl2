package ch_07_meyhod_ex;

import java.util.Scanner;

public class Ex05_01 {
    /*
    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 2
    계좌를 먼저 생성해 주세요.

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 1
    계좌가 생성되었습니다. 초기 잔액: 0원

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 2
    입금액> 5000
    입금 완료. 현재 잔액: 5000원

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 3
    출금액> 2000
    출금 완료. 현재 잔액: 3000원

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 4
    현재 잔액: 3000원

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 3
    출금액> 5000
    잔액이 부족합니다.

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 5
    프로그램 종료
     */
    static Scanner scanner = new Scanner(System.in);
    static int balance = -1;
    static int money;

    public static void main(String[] args) {

        boolean flag = true; // 반복문의 조건으로 사용 -> 값이 false가 된다면 반복문이 종료.
        while (flag) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            switch (selectNo) {
                case 1:
                    balance = createAccount(balance);
                    break;
                case 2:
                    balance = inputDeposit(balance);
                    break;
                case 3:
                    balance = printWithdrawal(balance);
                    break;
                case 4:
                    System.out.println("현재 잔액: " + balance);
                    break;
                case 5:
                    flag = setRun();

            }
        }
    }

    static int createAccount(int balance) {
        if (balance != -1) {
            System.out.println("이미계좌가 생성되어있습니다.");
            return balance;
        }
        balance = 0;
        System.out.println("계좌가 생성되었습니다. 초기잔액: " + balance + "원");
        return balance;
    }

    static int inputDeposit(int balance) {
        if (balance == -1) {
            System.out.println("계좌를 먼저 생성해 주세요.");
            return balance;
        }
        if (balance >= 0) {
            System.out.print("입금액> ");
            balance += scanner.nextInt();
            System.out.println("입금 완료. 현재 잔액: " + balance + "원");
            return balance;

        }
        return balance;
    }

    static int printWithdrawal(int balance) {
        System.out.print("출금액> ");
        money = scanner.nextInt();
        if (money > balance) {
            System.out.println("잔액이 부족합니다.");
            return balance;
        }
        balance -= money;
        System.out.println("현재 잔액: " + balance);
        return balance;
    }

    static boolean setRun() {
        System.out.println("프로그램 종료");
        scanner.close();
        return false;
    }
}
