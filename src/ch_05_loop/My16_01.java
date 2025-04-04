package ch_05_loop;

import java.util.Scanner;

public class My16_01 {
    public static void main(String[] args) {
        /* 잔액이 10000원. 사용할 금액을 입력받아 잔액이 0원이 되도록 */
        /* 추가 요구 사항 : 1) 한번에 출금할 수 있는 금액은 1000원 이하 2) break 사용하지 말것 조건 추가 */

        Scanner sc = new Scanner(System.in);
        int money = 10000;
        int sum;
        System.out.println("현재 가진 돈은 " + money + "원입니다.");

        /*
        1. 사용자에게 반복해서 출금액을 입력받음
        2. 잔액보다 크거나, 음수를 입력하면 다시 입력 요구 (continue 사용)
        3. 잔액이 0원이 되면 반복문을 종료 (break 사용)
         */
        while (money != 0) {
            System.out.print("얼마를 사용하시겠습니까? >>> ");
            int spendMoney = sc.nextInt(); // 정수를 입력받음

            // 잔액보다 크거나, 음수를 입력하면 다시 입력 요구
            if (money < spendMoney || spendMoney < 0) {
                System.out.println("다시 입력해 주세요(사용범위가 틀렸습니다.)");
                continue;
            }
            if (spendMoney > 1000) {
                System.out.println("1000원 보다 큰 금액은 출금할 수 없습니다.");
                continue;
            }
            money -= spendMoney;
            System.out.println("이제 " + money + "원이 남았습니다.");
        }

        System.out.println("모든 돈을 사용합니다. 종료");
        sc.nextLine();
    }
}
