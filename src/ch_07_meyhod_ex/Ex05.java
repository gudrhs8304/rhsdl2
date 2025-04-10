package ch_07_meyhod_ex;

import java.util.Scanner;

public class Ex05 {
    static Scanner scanner = new Scanner(System.in);
    static Integer balance = null;
    static int money;
    public static void main(String[] args) {

        boolean flag = true; // 반복문의 조건으로 사용 -> 값이 false가 된다면 반복문이 종료.
        while (flag) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                balance = 0;
                System.out.println("계좌가 생성되었습니다. 초기잔액: " + balance + "원");
            } else if (selectNo == 2) {
                printDeposit();
            } else if (selectNo == 3) {
                printWithdrawal();
            } else if (selectNo == 4) {
                System.out.println("현재 잔액: " + balance);
            } else if (selectNo == 5) {
                flag = setRun();

            }
        }
        System.out.println("프로그램 종료");
    }

    static void printDeposit() {
        if (balance == null) {
            System.out.println("계좌를 먼저 생성해 주세요.");
            return;
        }
        if (balance >= 0) {
            System.out.print("입금액> ");
            money = scanner.nextInt();
            balance = balance + money;
            System.out.println("입금 완료. 현재 잔액: " + balance + "원");
        }
    }

    static void printWithdrawal() {
        System.out.print("출금액> ");
        money = scanner.nextInt();
        if (money > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= money;
            System.out.println("현재 잔액: " + balance);
        }
    }

    static boolean setRun() {
        return false;
    }
}
