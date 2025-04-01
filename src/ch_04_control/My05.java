package ch_04_control;

import java.util.Scanner;

public class My05 {
    public static void main(String[] args) {
        /*  중첩 if문 : if문 안에 if가 있는 경우

        아이디, 비밀번호를 입력받아서 로그인 처리.
        id : java, pass : 1234
        아이디가 맞는 경우에는 비밀번호를 입력받음.
        아이디가 틀린 경우에는 에러메시지 출력.
         */
        Scanner sc = new Scanner(System.in);
        String id, password;

        System.out.print("아이디를 입력해 주세요: ");
        id = sc.nextLine();

        if (id.equals("java")) { // 아이디가 맞는 경우
            System.out.println("아이디 일치");
            System.out.print("비밀번호를 입력해주세요: ");
            password = sc.nextLine();
            if (password.equals("1234")) {
                System.out.println("비밀번호 일치");
            } else {
                System.out.println("비밀번호 불일치");
            }
        } else { // 아이디가 틀린 경우
            System.out.println("아이디 불일치");
        }
    }
}
