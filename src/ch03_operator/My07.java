package ch03_operator;

import java.util.Scanner;

public class My07 {
    public static void main(String[] args) {
        /* Scanner.nextline() : 문자열 입력 */
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("이름을 입력하시오: ");
        name = scanner.nextLine();

        System.out.print("나이를 입력하시오: ");
        age = scanner.nextInt();

        System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
        scanner.close();






    }
}
