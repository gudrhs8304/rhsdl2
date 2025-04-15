package ch_08_class_ex.account;

import java.util.Objects;
import java.util.Scanner;

public class Test02 {


    private static final Scanner scanner = new Scanner(System.in);
    // 참조변수에 저장이 되는것은 주소값이라서 배열의 값 변동과 상관없이 상수 사용 가능.
    private static final Account[] accounts = new Account[100];

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                isRun = false;
            }
        }
        System.out.println("프로그램 종료");

    }

    private static void createAccount() {
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        Account account = new Account(ano, owner, balance);
        // account는 지역 변수라서 메서드가 종료되면 사라짐. 그래서 멤버 변수인 accounts에 저장.
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                System.out.println("결과: 계좌가 생성되었습니다.");
                System.out.println(accounts[i]);
                break;
            }
        }
    }

    private static void accountList() {
        /*계좌 목록 */
        System.out.println("-----------");
        System.out.println("계좌목록");
        System.out.println("-----------");
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                break;
            }
            System.out.println(accounts[i]);
        }
    }

    private static void deposit() {
        /* 예금 */
        System.out.println("---------");
        System.out.println("예금");
        System.out.println("---------");
        System.out.println("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();

        Account account = findAccount(ano);
        // 입금처리
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.println(account);
    }

    private static void withdraw() {
        System.out.println("---------");
        System.out.println("출금");
        System.out.println("---------");
        System.out.println("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int money = scanner.nextInt();

        Account account = findAccount(ano);

        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println(account);
    }

    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                break;
            }
            if (ano.equals(accounts[i].getAno())) {
                account = accounts[i];
                break;
            }
        }
        return account;
    }
}
