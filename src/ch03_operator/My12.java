package ch03_operator;

import java.util.Scanner;

public class My12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("나이를 입력하세요. > ");
        age = sc.nextInt();

        //System.out.println(age >= 19 ? "성인입니다" : "성인이 아닙니다");
        //System.out.println(age < 19 ? "성인이 아닙니다" : "성인입니다");
        System.out.println(!(age >= 19) ? "성인이 아닙니다" : "성인입니다");
        sc.close();
    }
}
